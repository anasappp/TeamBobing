package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class sihongTest {

    private sihong sihongUnderTest;

    @Before
    public void setUp() throws Exception {
        sihongUnderTest = new sihong();
        sihongUnderTest.a = mock(Intent.class);
        sihongUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        sihongUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
