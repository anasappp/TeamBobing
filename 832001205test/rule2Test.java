package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class rule2Test {

    private rule2 rule2UnderTest;

    @Before
    public void setUp() throws Exception {
        rule2UnderTest = new rule2();
        rule2UnderTest.a = mock(Intent.class);
        rule2UnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        rule2UnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
