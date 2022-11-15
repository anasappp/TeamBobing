package com.example.myapplication;

import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class multiTest {

    private multi multiUnderTest;

    @Before
    public void setUp() throws Exception {
        multiUnderTest = new multi();
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        multiUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
