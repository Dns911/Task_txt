package com.epam.texttask.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TextWriter {
    private static String DEFAULT_OUT_FILE = "data\\res.txt";

    public void textToFile(String str, String fileName, boolean append) {
        File file = new File(fileName);
        if (!file.exists()) {
            file = new File(DEFAULT_OUT_FILE);
        }

        try (PrintStream stream = new PrintStream(new FileOutputStream(file, append))) {
            stream.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
