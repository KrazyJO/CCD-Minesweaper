package de.wbg.jotte.tests;

import de.wbg.jotte.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelTest {

    private ArrayList<String> getTestModel() {
        ArrayList<String> m = new ArrayList<>();
        m.add("*...");
        m.add("....");
        m.add(".*..");
        m.add("....");
        return m;
    }

    @Test
    public void testInitializeInputArray() {
        Model m = new Model();
        m.initializeInputArray(getTestModel());
        assertEquals(4, m.getInput().length);
        assertEquals(4, m.getInput()[0].length);
    }

    @Test
    public void testBuildModel() {
        Model m = new Model();
        m.buildModel(getTestModel());
        assertEquals("*", m.getInput()[0][0]);
        assertEquals("0", m.getInput()[0][1]);
        assertEquals("0", m.getInput()[1][0]);
        assertEquals("0", m.getInput()[1][1]);
    }

}
