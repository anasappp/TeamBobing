package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class wuhongduoTest {

    private wuhongduo wuhongduoUnderTest;

    @Before
    public void setUp() throws Exception {
        wuhongduoUnderTest = new wuhongduo();
        wuhongduoUnderTest.a = mock(Intent.class);
        wuhongduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        wuhongduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
