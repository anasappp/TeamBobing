package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class wuhongTest {

    private wuhong wuhongUnderTest;

    @Before
    public void setUp() throws Exception {
        wuhongUnderTest = new wuhong();
        wuhongUnderTest.a = mock(Intent.class);
        wuhongUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        wuhongUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
