package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class wuduoTest {

    private wuduo wuduoUnderTest;

    @Before
    public void setUp() throws Exception {
        wuduoUnderTest = new wuduo();
        wuduoUnderTest.a = mock(Intent.class);
        wuduoUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        wuduoUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
