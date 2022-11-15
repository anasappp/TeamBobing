package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class biandijinTest {

    private biandijin biandijinUnderTest;

    @Before
    public void setUp() {
        biandijinUnderTest = new biandijin();
        biandijinUnderTest.a = mock(Intent.class);
        biandijinUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        biandijinUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
