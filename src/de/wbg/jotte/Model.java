package de.wbg.jotte;

import java.util.ArrayList;

public class Model {

    String input[][];

    public void buildModel(ArrayList<String> content) {
        initializeInputArray(content);
        for (var i = 0; i < content.size(); i++) {
            var line = content.get(i);
            for (var j = 0; j < content.get(i).length(); j++) {
                var character = String.valueOf(line.charAt(j));
                input[i][j] =  transformCharacter(character);
            }
        }
    }

    public String transformCharacter(String character) {
        if (character.equals("*")) {
            return "*";
        }

        return "0";
    }

    public void initializeInputArray(ArrayList<String> content) {
        int rows = content.size();
        int columns = content.get(0).length();
        input = new String[rows][columns];
    }

    public String[][] getInput() {
        return input;
    }

    public void setInput(String[][] input) {
        this.input = input;
    }
}
