package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class jurenTest {

    private juren jurenUnderTest;

    @Before
    public void setUp() throws Exception {
        jurenUnderTest = new juren();
        jurenUnderTest.a = mock(Intent.class);
        jurenUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        jurenUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
