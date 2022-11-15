package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class xiucaiduoTest {

    private xiucaiduo xiucaiduoUnderTest;

    @Before
    public void setUp() throws Exception {
        xiucaiduoUnderTest = new xiucaiduo();
        xiucaiduoUnderTest.a = mock(Intent.class);
        xiucaiduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        xiucaiduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
