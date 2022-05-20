package com;

import java.io.File;
import java.io.FileWriter;

import com.app.Medewerker;
import com.app.Pad;
import com.google.gson.Gson;

public class GsonManager {

    private static Gson gson = new Gson();

    /**
     * Writes the given {@link Medewerker} in JSON format to the Medewerkers file.
     * @param medewerker the to be written User object
     */
    public static void writeToSave(Medewerker medewerker) {
        String dir = System.getProperty("medewerker.dir")+"\\data\\";
        File savefile = new File(dir+"Medewerkers.json");
        write(savefile, medewerker);
    }

    /**
     * Writes the given {@link Pad} in JSON format to the Pad file.
     * @param pad the to be written pad object
     */
    public static void writeToSave(Pad pad) {
        String dir = System.getProperty("pad.dir")+"\\data\\";
        File savefile = new File(dir+"Pad.json");
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
            FileWriter writer = new FileWriter(savefile,true);
            try{savefile.createNewFile();}catch(Exception e){} //Simple Onliners good?
            writer.append(gson.toJson(object+"\n"));
            writer.close();
        }
        catch(Exception e){}
    }
}

