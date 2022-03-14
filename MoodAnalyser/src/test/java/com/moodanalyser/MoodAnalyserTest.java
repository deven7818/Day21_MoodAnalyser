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
	 * method meeageSadMood to check mood 
	 * it returns Sad mood as we pass sad mood
	 */
	@Test
	public void messageSadMood() {
		String result = mood.analyseMood("I am in Sad mood" );
		Assert.assertEquals("SAD", result);
	}
}