package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class chajinhuaTest {

    private chajinhua chajinhuaUnderTest;

    @Before
    public void setUp() {
        chajinhuaUnderTest = new chajinhua();
        chajinhuaUnderTest.a = mock(Intent.class);
        chajinhuaUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        chajinhuaUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
