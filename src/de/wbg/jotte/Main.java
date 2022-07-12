package de.wbg.jotte;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();

        String[] a = {"src/de/wbg/jotte/testInput2.txt"};
	    String path = FileReader.getInputFile(a);
        ArrayList<String> content = FileReader.readFile(path);
        model.buildModel(content);
        Counter.countBombs(model);
        FileWriter writer = new FileWriter(model.getInput());
        writer.writeToFile(model, "output.txt");
    }
}
