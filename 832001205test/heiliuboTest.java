package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class heiliuboTest {

    private heiliubo heiliuboUnderTest;

    @Before
    public void setUp() {
        heiliuboUnderTest = new heiliubo();
        heiliuboUnderTest.a = mock(Intent.class);
        heiliuboUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        heiliuboUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
