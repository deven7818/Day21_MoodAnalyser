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
	
	@Test
	public void messageHappyMood() {
		mood.setMessage("I am in Happy Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}

}