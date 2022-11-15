package com.example.myapplication;

import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class singlegameTest {

    private singlegame singlegameUnderTest;

    @Before
    public void setUp() throws Exception {
        singlegameUnderTest = new singlegame();
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        singlegameUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
