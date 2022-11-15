package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class wuziduoTest {

    private wuziduo wuziduoUnderTest;

    @Before
    public void setUp() throws Exception {
        wuziduoUnderTest = new wuziduo();
        wuziduoUnderTest.a = mock(Intent.class);
        wuziduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        wuziduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
