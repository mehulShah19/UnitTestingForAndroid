package com.mehul.appvilla.unittesting.junit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Mehul on 21/10/16.
 */
public class StringHelperTest {

    private static StringHelper stringHelper;
    //StringHelper stringHelper;

    /*
    First Log methods are not supported in Junit Framework, so we have to use System.out.println for printing on the console
    All the methods needs to start with public void since Junit framework is not the part of current project
    @BeforeClass and @AfterClass also required static keyword
    @Before and @After will be called af

     */

    @BeforeClass
    static public void classInitialization(){
        stringHelper = new StringHelper();
    }


    @Before
    public void beforeEveryMethod(){
        System.out.print("before every Method");
    }

    @Test
    public void testTruncateInFirst2Positions(){
        assertEquals("ABC", "ABC");
        System.out.print("INside Method");
        assertEquals("BC", stringHelper.truncateAInFirst2Positions("ABC"));
    //    assertEquals("AASD", stringHelper.truncateAInFirst2Positions("ABC"));

    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame(){

        assertTrue("This message will be shown if the condition is not successful", stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
     //   Assert.assertFalse("This message will be shown if the condition is not successful", stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));

    }
}

