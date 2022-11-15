package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class tanhuaTest {

    private tanhua tanhuaUnderTest;

    @Before
    public void setUp() throws Exception {
        tanhuaUnderTest = new tanhua();
        tanhuaUnderTest.a = mock(Intent.class);
        tanhuaUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        tanhuaUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
