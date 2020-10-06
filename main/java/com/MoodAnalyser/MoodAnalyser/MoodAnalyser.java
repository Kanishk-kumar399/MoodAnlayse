package com.MoodAnalyser.MoodAnalyser;

import com.MoodAnalyser.MoodAnalyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyser 
{
	private String message;
	
    public MoodAnalyser(String message) {
		super();
		this.message = message;
	}
	public String analyseMood(String message) throws MoodAnalysisException
    {
    	this.message=message;
    	return analyseMood();
    }
	public String analyseMood() throws MoodAnalysisException
    {
    try {
    	   if(message.length()==0)
    		   throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Entered_EMPTY,"Please Enter a proper message");
    	   else if(message.contains("sad")) 
    	   {
    		   return "SAD";
    	   }
    	   else
    	   {
    		   return "HAPPY";
    	   }   
         }
    catch(NullPointerException e)
     {
    	throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Entered_NULL,"Please Enter a proper message");
     }
    }
}
