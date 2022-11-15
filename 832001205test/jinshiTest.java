package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class jinshiTest {

    private jinshi jinshiUnderTest;

    @Before
    public void setUp() throws Exception {
        jinshiUnderTest = new jinshi();
        jinshiUnderTest.a = mock(Intent.class);
        jinshiUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        jinshiUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
