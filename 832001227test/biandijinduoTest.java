package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class biandijinduoTest {

    private biandijinduo biandijinduoUnderTest;

    @Before
    public void setUp() {
        biandijinduoUnderTest = new biandijinduo();
        biandijinduoUnderTest.a = mock(Intent.class);
        biandijinduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        biandijinduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
