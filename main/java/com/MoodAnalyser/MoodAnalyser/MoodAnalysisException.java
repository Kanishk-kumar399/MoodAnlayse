package com.MoodAnalyser.MoodAnalyser;

public class MoodAnalysisException extends Exception 
{
	enum ExceptionType{
		Entered_EMPTY,Entered_NULL
	}
	ExceptionType type;
		public MoodAnalysisException(ExceptionType type, String message) {
			super(message);
			this.type=type;
		}
}
