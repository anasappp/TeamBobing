package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class bangyanduoTest {

    private bangyanduo bangyanduoUnderTest;

    @Before
    public void setUp() {
        bangyanduoUnderTest = new bangyanduo();
        bangyanduoUnderTest.a = mock(Intent.class);
        bangyanduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        bangyanduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
