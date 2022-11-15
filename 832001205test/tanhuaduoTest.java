package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class tanhuaduoTest {

    private tanhuaduo tanhuaduoUnderTest;

    @Before
    public void setUp() throws Exception {
        tanhuaduoUnderTest = new tanhuaduo();
        tanhuaduoUnderTest.a = mock(Intent.class);
        tanhuaduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        tanhuaduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
