package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class wuziTest {

    private wuzi wuziUnderTest;

    @Before
    public void setUp() throws Exception {
        wuziUnderTest = new wuzi();
        wuziUnderTest.a = mock(Intent.class);
        wuziUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        wuziUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
