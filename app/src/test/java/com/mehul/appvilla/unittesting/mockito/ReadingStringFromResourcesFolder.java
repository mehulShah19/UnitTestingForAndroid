package com.mehul.appvilla.unittesting.mockito;

import android.content.Context;

import com.mehul.appvilla.unittesting.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Mehul on 22/10/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class ReadingStringFromResourcesFolder {

@Mock
Context context;
private final static String FAKE_STRING = "Hello_World";

    @Test
    public void readStringFromContext_localizedString(){
        when(context.getString(R.string.app_name))
                .thenReturn(FAKE_STRING);

        // ...then the result should be the expected one.
        assertEquals(context.getString(R.string.app_name), (FAKE_STRING));

    }




}
