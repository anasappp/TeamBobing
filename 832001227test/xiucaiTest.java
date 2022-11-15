package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class xiucaiTest {

    private xiucai xiucaiUnderTest;

    @Before
    public void setUp() throws Exception {
        xiucaiUnderTest = new xiucai();
        xiucaiUnderTest.a = mock(Intent.class);
        xiucaiUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        xiucaiUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
