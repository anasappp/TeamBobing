package com.example.myapplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;

public class originTest {

    private origin originUnderTest;

    @Before
    public void setUp() throws Exception {
        originUnderTest = new origin();
        originUnderTest.button = mock(Button.class);
    }

    @Test
    public void testOnCreate() throws Exception {
        // Setup
        final Bundle savedInstanceState = new Bundle(0);

        // Run the test
        originUnderTest.onCreate(savedInstanceState);

        // Verify the results
        verify(originUnderTest.button).setOnClickListener(any(View.OnClickListener.class));
    }
}
