package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class jurenduoTest {

    private jurenduo jurenduoUnderTest;

    @Before
    public void setUp() throws Exception {
        jurenduoUnderTest = new jurenduo();
        jurenduoUnderTest.a = mock(Intent.class);
        jurenduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        jurenduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
