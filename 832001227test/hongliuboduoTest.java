package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class hongliuboduoTest {

    private hongliuboduo hongliuboduoUnderTest;

    @Before
    public void setUp() throws Exception {
        hongliuboduoUnderTest = new hongliuboduo();
        hongliuboduoUnderTest.a = mock(Intent.class);
        hongliuboduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        hongliuboduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
