package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class hongliuboTest {

    private hongliubo hongliuboUnderTest;

    @Before
    public void setUp() throws Exception {
        hongliuboUnderTest = new hongliubo();
        hongliuboUnderTest.a = mock(Intent.class);
        hongliuboUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        hongliuboUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
