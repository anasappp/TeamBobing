package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class rule1Test {

    private rule1 rule1UnderTest;

    @Before
    public void setUp() throws Exception {
        rule1UnderTest = new rule1();
        rule1UnderTest.a = mock(Intent.class);
        rule1UnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        rule1UnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
