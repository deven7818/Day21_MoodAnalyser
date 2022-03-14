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
	 */
	@Test
	public void messageHappyMood() {
		mood.setMessage("I am in Happy Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}
	
	/**
	 * method will return sad mood when message given is sad
	 */
	@Test
	public void messageSadMood() {
		mood.setMessage("I am in Sad Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("SAD", result);
	}

	/**
	 * method will return Happy mood when message given is any mood
	 */
	@Test
	public void anyMood() {
		mood.setMessage("I am in any Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}
	
	/**
	 * method will return invalid Mood when null value is given
	 */
	@Test
	public void nullMood() {
		mood.setMessage(null);
		String result = mood.analyseMood();
		Assert.assertEquals("Invalid Mood", result);
	}

}