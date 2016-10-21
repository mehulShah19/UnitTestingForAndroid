package com.mehul.appvilla.unittesting.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Mehul on 21/10/16.
 */
@RunWith(Parameterized.class)
public class ParameterizedStringHelperTest {

    String expectedOutput;
    String input;
    StringHelper helper = new StringHelper();

    public ParameterizedStringHelperTest(String input, String expectedOutput){
            this.expectedOutput = expectedOutput;
            this.input = input;
    }


    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][] ={{"AACD","CD"}, {"ACD", "CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Postions(){
        Assert.assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

    }

}
