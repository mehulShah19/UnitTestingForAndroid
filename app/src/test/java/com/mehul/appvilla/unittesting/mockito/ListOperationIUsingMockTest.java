package com.mehul.appvilla.unittesting.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

/**
 * Created by Mehul on 22/10/16.
 */

//Mockito Test doesnt change final, static variables, private methods



@RunWith(MockitoJUnitRunner.class)
public class ListOperationIUsingMockTest {

    @Mock
    private List<String> stringList;

    @Test
    public void stringComparision(){
        Mockito.when(stringList.get(0)).thenReturn("ABC");
        Mockito.when(stringList.get(10)).thenReturn("ABC10");

        String stringAtPosition0 = stringList.get(0);
        Assert.assertEquals(stringAtPosition0, "ABC");
        int getListSize = stringList.size();
        System.out.print("List Size" + stringList.size());

    }

}
