package de.wbg.jotte.tests;

import de.wbg.jotte.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FileReaderTest {

    @Test
    public void readPathFromArgs() {
        String args[] = {"filePath"};
        String filePath = FileReader.getInputFile(args);
        Assertions.assertEquals("filePath", filePath);
    }

    @Test
    public void readFile() {
        ArrayList<String> content = FileReader.readFile("src/de/wbg/jotte/testInput.txt");
        Assertions.assertEquals("*...", content.get(0));
        Assertions.assertEquals("....", content.get(1));
    }

}
