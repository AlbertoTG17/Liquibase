package sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

import netgloo.Application;

import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new Application();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

//    @Test
//    public void testAppMain()
//    {
//        Application.main(null);
//        try {
//            assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
//        } catch (AssertionError e) {
//            fail("\"message\" is not \"Hello World!\"");
//        }
//    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
