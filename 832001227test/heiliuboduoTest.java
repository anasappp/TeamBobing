package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class heiliuboduoTest {

    private heiliuboduo heiliuboduoUnderTest;

    @Before
    public void setUp() throws Exception {
        heiliuboduoUnderTest = new heiliuboduo();
        heiliuboduoUnderTest.a = mock(Intent.class);
        heiliuboduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        heiliuboduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
