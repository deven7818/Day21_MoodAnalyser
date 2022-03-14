package com.moodanalyser;


/**
 * PRODECURE
 * 
 * We Created this class to check the mood Happy , Sad or Any mood
 * We Created a method analyseMood that will take a string input and return the moods.
 */
public class MoodAnalyzer {
	/**
	 * Method analyseMood check if the mood is happy or sad.
	 * 1. We will convert the message to lower case and check it the string contains happy or sad word in it.
	 * Checking the mood and return Happy or Sad mood.
	 * @param message -  passing the string message from the method.
	 * @return - will return the mood Happy or Sad 
	 */
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return null;
		}
	}
}