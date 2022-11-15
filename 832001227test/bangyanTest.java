package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class bangyanTest {

    private bangyan bangyanUnderTest;

    @Before
    public void setUp() {
        bangyanUnderTest = new bangyan();
        bangyanUnderTest.a = mock(Intent.class);
        bangyanUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        bangyanUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
