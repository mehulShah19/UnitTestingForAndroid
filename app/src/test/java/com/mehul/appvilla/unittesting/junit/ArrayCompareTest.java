package com.mehul.appvilla.unittesting.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Mehul on 21/10/16.
 */
public class ArrayCompareTest {


    /**
     * Normal assertEquals wont work because both are different object
     */
    @Test
    public void comparingArrayTest(){
        int []numbers = {1,2,34,21};
        int []expected = {1,2,21,34};
        Arrays.sort(numbers);
        Assert.assertArrayEquals(expected, numbers);

    }

    // Checking Exception
    @Test
    public void checkingNullExpetiontest(){
        int []numbers = null;
        try {
            Arrays.sort(numbers);
        }catch (NullPointerException nullPointerException){

        }

    }
    //Checking Exception other way
    @Test(expected = NullPointerException.class)
    public  void checkingNullPointerExceptionTest(){
        int []numbers = null;
        Arrays.sort(numbers);
    }

    //Checking Performance
    @Test(timeout = 100) // it's in millesecond
    public void checkingPerfomrancetest(){
        int numbers[] = {12, 12,132};
        for (int i=0; i< 100000; i++){
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
