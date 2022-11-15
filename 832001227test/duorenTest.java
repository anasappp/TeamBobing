package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class duorenTest {

    private duoren duorenUnderTest;

    @Before
    public void setUp() {
        duorenUnderTest = new duoren();
        duorenUnderTest.a = mock(Intent.class);
        duorenUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        duorenUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
