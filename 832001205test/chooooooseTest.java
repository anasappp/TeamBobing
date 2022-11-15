package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class chooooooseTest {

    private choooooose chooooooseUnderTest;

    @Before
    public void setUp() {
        chooooooseUnderTest = new choooooose();
        chooooooseUnderTest.a = mock(Intent.class);
        chooooooseUnderTest.b = mock(Intent.class);
        chooooooseUnderTest.c = mock(Intent.class);
        chooooooseUnderTest.d = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        chooooooseUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
