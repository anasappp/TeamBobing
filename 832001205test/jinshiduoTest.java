package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class jinshiduoTest {

    private jinshiduo jinshiduoUnderTest;

    @Before
    public void setUp() throws Exception {
        jinshiduoUnderTest = new jinshiduo();
        jinshiduoUnderTest.a = mock(Intent.class);
        jinshiduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        jinshiduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
