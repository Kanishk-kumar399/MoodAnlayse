package com.MoodAnalyser.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class MoodAnalyserTest 
{
	 @Test
	    public void givenHappyMood_ShouldReturnSad()
	    {
	        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad mood");
	        String mood=null;
			try {
				mood = moodAnalyser.analyseMood();
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
	        Assert.assertEquals("SAD", mood);
	    }
	    @Test
	    public void givenAnyMood_ShouldReturnHappy()
	    {
	        MoodAnalyser moodAnalyser=new MoodAnalyser("i am in happy mood");
	        String mood=null;
			try {
				mood = moodAnalyser.analyseMood();
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
	        Assert.assertEquals("HAPPY", mood);
	    }
    @Test
    public void givenNullMood_ShouldThrowException()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        try {
        	moodAnalyser.analyseMood();
    	}
    catch(MoodAnalysisException e)
        {
    	Assert.assertEquals(MoodAnalysisException.ExceptionType.Entered_NULL,e.type);
        }
    }
}
