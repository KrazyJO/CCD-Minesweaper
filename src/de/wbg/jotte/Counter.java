package de.wbg.jotte;

public class Counter {

    public static Model countBombs(Model model) {
        for (var x = 0; x < model.getInput().length; x++) {
            var line = model.getInput()[x];
            for (var y = 0; y < line.length; y++) {
                var character = line[y];
                if (isBomb(character)) {
                    countUpNeighbours(x, y, model);
                }
            }
        }
        return model;
    }

    public static void countUpNeighbours(int x, int y, Model m) {
        for (var x_ = x -1; x_ < x+2; x_++) {
            for (var y_ = y -1; y_ < y +2; y_++) {
                if (isInBounds(x_, y_, m.getInput()) && !isBomb(m.getInput()[x_][y_])) {
                    countUpSingleField(x_, y_, m);
                }
            }
        }
    }

    public static void countUpSingleField(int x, int y, Model m) {
        int num = Integer.parseInt(m.getInput()[x][y]);
        num++;
        m.getInput()[x][y] = String.valueOf(num);
    }

    public static boolean isInBounds(int x, int y, String[][] m) {
        if (x > m.length - 1) return false;
        if (y > m[0].length - 1) return false;
        if (x < 0) return false;
        if (y < 0) return false;

        return true;
    }

    public static boolean isBomb(String character) {
        return character.equals("*");
    }
}
