package de.wbg.jotte;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {

    public static String getInputFile(String[] args) {
        return args[0];
    }

    public static ArrayList<String> readFile(String path) {
        ArrayList<String> content = new ArrayList<>();
        Path p = Paths.get(path);
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(p, StandardCharsets.UTF_8);

            while (bufferedReader.ready()) {
                String l = bufferedReader.readLine(); //headline;
                if (l != null) {
                    content.add(l);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("file not found");
            return null;
        }
        return content;
    }

}
