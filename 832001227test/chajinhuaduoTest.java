package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class chajinhuaduoTest {

    private chajinhuaduo chajinhuaduoUnderTest;

    @Before
    public void setUp() {
        chajinhuaduoUnderTest = new chajinhuaduo();
        chajinhuaduoUnderTest.a = mock(Intent.class);
        chajinhuaduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        chajinhuaduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
