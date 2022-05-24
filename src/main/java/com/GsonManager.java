package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.Medewerker;
import com.app.Pad;
import com.google.gson.Gson;

public class GsonManager {

  private static Gson gson = new Gson();

  public static void saveFile() {
    writeToSaveMedewerker();
    writeToSavePad();
  }
  /**
   * Writes the given {@link Medewerker} in JSON format to the Medewerkers file.
   */
  public static void writeToSaveMedewerker() {
      String dir = System.getProperty("user.dir")+"\\data\\";
      File savefile = new File(dir+"Medewerkers.json");
      cleanFile(savefile, true);
      for(Medewerker e : Medewerker.MedewerkerList){
        write(savefile, e);
      }
  }
  /**
   * Writes the given {@link Pad} in JSON format to the Pad file.
   */
  public static void writeToSavePad() {
    String dir = System.getProperty("user.dir")+"\\data\\";
    File savefile = new File(dir+"Pad.json");
    cleanFile(savefile, true);
    for(Pad x : Pad.PadList){
      write(savefile, x);
    }
  }

  /**
   * Writes the given object in the correct savefile
   */
  private static void write(File savefile, Object object) {
    try{
        FileWriter writer = new FileWriter(savefile,true);
        try{savefile.createNewFile();}catch(Exception e){} //Simple Onliners good?
        writer.append("\n"+makeString(object)+"\n");
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

  public static void loadFile (){  
    for(String s : readFile("Medewerkers")){
        Medewerker newMedewerker = gson.fromJson(s, Medewerker.class);
        System.out.println(newMedewerker.naam);
    }
    System.out.println("==========");
  }

    /**
   * Reads the lines of an JSON file located in ~\data and returns them as entries in an ArrayList
   * @param file
   * @return {@link ArrayList<String>}
   */
  private static ArrayList<String> readFile(String file) {
    String dir = System.getProperty("Medewerkers.dir")+"\\data\\";
    File savefile = new File(dir+file+".json");
    ArrayList<String> saveFileContents = new ArrayList<>();
    try {
        Scanner james = new Scanner(savefile);
        while (james.hasNextLine()) {
            String contents = james.nextLine();
            if(!contents.equals("")){
                saveFileContents.add(contents);
            }                
        }
    }
    catch(Exception e){}
    return saveFileContents;
  }

    /**
   * Cleans a file by deleting & remaking it.
   * @param savefile the {@link File} object to be cleaned.
   * @param makefile If you wish to only create a file.
   * @return boolean true if successfull, false if not.
   */
  public static boolean cleanFile(File savefile, boolean makefile) {
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
}

