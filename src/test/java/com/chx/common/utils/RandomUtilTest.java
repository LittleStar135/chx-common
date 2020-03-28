package com.chx.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1,120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1,10, 3);
		for (int i : is) {
			System.out.println(i);
		}
		
	}

	@Test
	public void testRandomCharacter() {
		
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
		
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(5);
		
		System.out.println(string);

	}
	

	@Test
	public void testrandomPhone() {
		String phone = RandomUtil.randomPhone();
		System.out.println(phone);
		
		
	}
	
	@Test
	public void testrandomSex() {
		
			String sex = RandomUtil.randomSex();
			System.out.println(sex);	
		
	}
	
	@Test
	public void testrandomEmail() {
		
		String email = RandomUtil.randomEmail();
		System.out.println(email);	
		
	}
	
	@Test
	public void testrandomBirthday() {
		
		String birthday = RandomUtil.randomDateBetweenMinAndMax();
		System.out.println(birthday);
		
	}
	

}
