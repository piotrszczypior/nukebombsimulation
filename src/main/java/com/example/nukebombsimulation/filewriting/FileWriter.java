package com.example.nukebombsimulation.filewriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileWriter {
    private final String path = "";

    File file = new File(path);

    public void write()
    {
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true));

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
