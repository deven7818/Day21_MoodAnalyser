package com.moodanalyser;

public class MoodAnalyseException extends Exception {
	public String message;

	public MoodAnalyseException(String message) {
		this.message = message;
	}
	

}
