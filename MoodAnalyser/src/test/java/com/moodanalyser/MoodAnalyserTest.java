package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

/**
 * We have created this test method to check the mood.
 * If we provide the string of sad then the method should return sad.
 * We have used the assert equals to check if the method is sad.
 *
 */
public class MoodAnalyserTest {
	/*
	 *Created moodAnalyer Object 
	 */
	MoodAnalyzer mood = new MoodAnalyzer();
	

	/**
	 * method will return happy mood when message given is happy
	 * @throws MoodAnalyseException 
	 */
	@Test
	public void messageHappyMood() throws MoodAnalyseException {
		mood.setMessage("I am in Happy Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}
	
	/**
	 * method will return sad mood when message given is sad
	 * @throws MoodAnalyseException 
	 */
	@Test
	public void messageSadMood() throws MoodAnalyseException {
		mood.setMessage("I am in Sad Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("SAD", result);
	}

	/**
	 * method will return Happy mood when message given is any mood
	 * @throws MoodAnalyseException 
	 */
	@Test
	public void anyMood() throws MoodAnalyseException {
		mood.setMessage("I am in any Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}
	
	/**
	 *method nullShouldReturHappy will return Happy when null value is given 
	 */
	@Test
	public void nullException() throws MoodAnalyseException {
		mood.setMessage(null);
		try {
		String result = mood.analyseMood();
		Assert.assertEquals("Invalid Mood", result);
	}catch(MoodAnalyseException ex) {
		System.out.println("Empty Mood");
	}
	}
}








