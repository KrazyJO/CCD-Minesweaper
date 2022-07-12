package de.wbg.jotte;

import java.io.BufferedWriter;

public class FileWriter {

    String[][] result;

    public FileWriter(String[][] result) {
        this.result = result;
    }

    public void writeToFile(Model m, String fileName) {
        String writeable = transformToWriteableString();
        writeStringToFile(writeable);
    }

    public void writeStringToFile(String output) {
        try {
            BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("output.txt"));
            writer.write(output);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String transformToWriteableString() {
        StringBuffer sb = new StringBuffer();
        for (var x = 0; x < result.length; x++) {
            for (var y = 0; y < result[x].length; y++) {
                sb.append(result[x][y]);
            }

            if (x < result.length -1 ) {
                sb.append("\r\n");
            }
        }

        return sb.toString();
    }
}
