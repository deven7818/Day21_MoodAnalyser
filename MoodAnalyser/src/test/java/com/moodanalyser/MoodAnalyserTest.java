package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

/**
 * We have created this test method to check the mood.
 * If we provide the string of happy then the method should return happy
 * If we provide the string of sad then the method should return sad.
 * We have used the assert equals to check if the method o/p is happy or sad.
 *
 */
public class MoodAnalyserTest {
	/*
	 *Created moodAnalyer Object 
	 */
	MoodAnalyzer mood = new MoodAnalyzer();
	
	/**
	 * method meeageHappyMood to check mood 
	 * it returns Happy mood as we pass happy mood
	 */
	@Test
	public void messageHappyMood() {
		String result = mood.analyseMood("I am in Happy mood" );
		Assert.assertEquals("HAPPY", result);
	}

	/**
	 * method meeageSadMood to check mood 
	 * it returns Sad mood as we pass sad mood
	 */
	@Test
	public void messageSadMood() {
		String result = mood.analyseMood("I am in Sad mood" );
		Assert.assertEquals("SAD", result);
	}
}