package com.example.myapplication;

import static org.mockito.Mockito.mock;

import android.content.Intent;
import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;

public class wuTest {

    private wu wuUnderTest;

    @Before
    public void setUp() throws Exception {
        wuUnderTest = new wu();
        wuUnderTest.a = mock(Intent.class);
        wuUnderTest.b = mock(Intent.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        wuUnderTest.onCreate(savedInstanceState);

        // Verify the results
    }
}
