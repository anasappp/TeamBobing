package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class sihongduoTest {

    private sihongduo sihongduoUnderTest;

    @Before
    public void setUp() throws Exception {
        sihongduoUnderTest = new sihongduo();
        sihongduoUnderTest.a = mock(Intent.class);
        sihongduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        sihongduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
