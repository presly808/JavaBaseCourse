package com.artcode;

import org.junit.After;
import org.junit.BeforeClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputRedirectionParentTest {

    protected static ByteArrayOutputStream baos;

    @BeforeClass
    public static void beforeAll() {
        // Create a stream to hold the output
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @After
    public void cleanUp(){
        baos.reset();
    }
}
