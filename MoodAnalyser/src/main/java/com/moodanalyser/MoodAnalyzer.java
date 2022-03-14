package com.moodanalyser;


/**
 * PRODECURE
 * 
 * We Created this class to check the mood Happy , Sad or Any mood
 * We Created a method analyseMood that will take a string input and return the moods.
 * Created default and parameterized constructor and passed message through constructor
 */
public class MoodAnalyzer {
	/*
	 * String message variable 
	 */
	public String message;
	
	
	/*
	 * Default Constructor
	 */
	public MoodAnalyzer() {
	}
	/*
	 * Parameterized Constructor
	 */
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/**
	 * Getter and setter methods
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * Method analyseMood check if the mood is happy or sad.
	 * 1. We will convert the message to lower case and check it the string contains happy or sad word in it.
	 * Checking the mood and return Happy or Sad mood.
	 * 2. if Any mood then it will return Happy 
	 * @param message -  passing the string message from the method.
	 * @return - will return the mood Happy or Sad 
	 */
	
	
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else if(message.toLowerCase().contains("any")){
			return "HAPPY";
		}else {
			return null;
		}
	}
}