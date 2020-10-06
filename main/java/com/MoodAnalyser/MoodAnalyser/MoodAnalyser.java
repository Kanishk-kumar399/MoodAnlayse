package com.MoodAnalyser.MoodAnalyser;
public class MoodAnalyser 
{
	private String message;
	
    public MoodAnalyser(String message) {
		super();
		this.message = message;
	}
	public MoodAnalyser()
    {
    	super();
    }
	public String analyseMood() throws MoodAnalysisException
    {
    try {
    	   if(message.contains("sad")) 
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
    	throw new MoodAnalysisException("Please Enter a proper message");
     }
    }
}
