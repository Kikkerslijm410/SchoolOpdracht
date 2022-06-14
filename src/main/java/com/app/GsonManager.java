package com.app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

/**
 * Sizable class that contains all the logic for reading and writing saves
 */
public class GsonManager {
    public static Gson gson = new Gson();
    static String dirt = System.getProperty("user.dir")+"\\data\\"; //dirt
    static ArrayList<File> fileList = new ArrayList<>(seedSaveFiles());

    //Temp solution
    public static ArrayList<File> seedSaveFiles() {
        ArrayList<File> fileList = new ArrayList<>();
        fileList.add(new File(dirt+"Medewerker.json"));
        fileList.add(new File(dirt+"Pad.json"));
        return fileList;
    }

    /**
     * Saves the currently existing Users & Transportmidddelen to their resective files
     */
    public static void saveFile() {
        System.out.println("================");//Debug
        System.out.println("Making savestate");//Debug
        cleanAllFiles();
        for(Medewerker u : LeaderBoard.medewerkers){
            GsonManager.writeToSave(u);
        }
        for(Pad t : Pad.PadList){
            GsonManager.writeToSave(t);
        }
    }

    /**
     * Loads the saved data from the respective savefiles
     */
    public static void loadAllFiles() {
        System.out.println("================");
        System.out.println("Loading files");
        
        for(File f : fileList){
            ArrayList<String> readLines = readFile(f);

            for(String s : readLines){
                //Not clean or efficient in the slightest but afaik its impossible to store Class.class .
                if(f.getName().contains("Medewerker")){
                    LeaderBoard.medewerkers.add(gson.fromJson(s, Medewerker.class));
                }
                else if(f.getName().contains("Pad")){
                    Pad.PadList.add(gson.fromJson(s, Pad.class));                    
                }
            }
        }
    }

    /**
     * Writes the given {@link Medewerker} in JSON format to the Medewerker file.
     * @param medewerker the to be written User object
     */
    public static void writeToSave(Medewerker medewerker) {
        File savefile = new File(dirt+"Medewerker.json");
        write(savefile, medewerker);
    }
    /**
     * Writes the given {@link Pad} in JSON format to the Pad file.
     * @param pad the to be written Reis object
     */
    public static void writeToSave(Pad pad) {
        File savefile = new File(dirt+"Pad.json");
        write(savefile, pad);
    }

    /**
     * Support method
     * <p>
     * Writes any given object in JSON format to the given file.
     * @param  savefile The {@link File} where the data is saved to.
     * @param object Any {@link Object} will do.
     */
    private static void write(File savefile, Object object) {
        try{
            checkFS(savefile);
            FileWriter writer = new FileWriter(savefile,true);
            try{savefile.createNewFile();}catch(Exception e){System.out.println("Oops");} //Simple Onliners good?
            writer.append(makeString(object)+"\n");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * Returns an object as a JSON-formatted string
     * @param object
     * @return String
     */
    public static String makeString(Object object) {
        return gson.toJson(object);
    }

    /**
     * Reads the lines of an JSON file located in ~\data\ and returns them as entries in an ArrayList
     * @param file
     * @return {@link ArrayList<String>}
     */
    private static ArrayList<String> readFile(File savefile) {
        ArrayList<String> saveFileContents = new ArrayList<>();
        try {
            Scanner james = new Scanner(savefile);
            while (james.hasNextLine()) {
                String contents = james.nextLine();
                if(!contents.equals("")){
                    saveFileContents.add(contents);
                }
            }
            james.close();
        }
        catch(Exception e){System.out.println("Oops");}
        return saveFileContents;
    }

    /**
     * Cleans a file by deleting & remaking it.
     * @param savefile the {@link File} object to be cleaned.
     * @param makefile If you wish to only create a file.
     * @return boolean true if successfull, false if not.
     * @throws IOException If the file does not exist
     */
    public static boolean cleanFile(File savefile,boolean makefile) {
        try{
            if(savefile.delete()){
                return savefile.createNewFile();
            }
            else if(makefile){
                return savefile.createNewFile();
            }
            return false;
        }
        catch(IOException e){
            System.out.println(e);
            return false;
        }
    }

    /**
     * Cleans all the files made by SaveManager.
     * @return {@code True} if succesfull.<p>
     *         {@code False} if not.
     */
    public static boolean cleanAllFiles() {
        try{
            for(File f : fileList){
                f.delete();
                f.createNewFile();
            }
            return true;
        }
        catch(Exception e){System.out.println(e);}
        return false;        
    }

    /**
     * Checks if the file/filesystem exists. If not it calls {@link #generateFS(File)}.
     * @param file
     * @return {@code true} if the filesystem was succesfully created or already exists.<p>
     *         {@code false} if the filesystem couldn't be made.
     */
    public static boolean checkFS(File file){
        try{
            if(file.exists()){
                return true;
            }
            else if(generateFS(file)){
                file.createNewFile();
                return true;
            }
            return false;
        }
        catch(Exception e){System.out.println(e);}
        return false;    
    }

    /**
     * Generates the Filesystem for a specified file.
     * @param file
     * @return {@code true} if the filesystem was succesfully created.<p>
     *         {@code false} if the filesystem couldn't be made.
     */
    public static boolean generateFS(File file) {
        //Split the actual file from the dirs
        String path = file.getAbsolutePath();
        String[] splitPath = path.split("\\\\");
        //Recombine the split string, leaving the last object in the path
        String newPath = "";
        for(int i=0;i<splitPath.length-1;i++){
            newPath += splitPath[i]+"\\";
        }
        //Make a new file with only the dir path & generate said path
        File fsGenFile = new File(newPath);
        if(fsGenFile.mkdirs()){
            return true;
        }
        return false;
    }
}
