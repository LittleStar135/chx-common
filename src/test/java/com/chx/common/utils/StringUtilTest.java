package com.chx.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {


	@Test
	public void testGetValue() {
		 String value = StringUtil.getValue("Œ“∞ÆŒ“º“", 2);
		 
		 System.out.println(value);
		
	}
	@Test
	public void testNumber() {
		boolean b = StringUtil.isNumber("-123.123");
		System.out.println(b);
		
	}
	
	
	
	@Test
	public void testEmain() {
		boolean b = StringUtil.isEMail("1357262719@qq.com");
		System.out.println(b);
		
	}
	
	@Test
	public void testPhone() {
		boolean b = StringUtil.isPhone("18539899501");
		System.out.println(b);
		
	}
	
	
	@Test
	public void testHasLength() {
		String src=" ";
		boolean b = StringUtil.hasLength(src);
		System.out.println(b);
		
	}

	@Test
	public void testHasText() {
		String src=" ";
		boolean b = StringUtil.hasText(src);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtil.randomChineseString(100);
		System.out.println(c);
		
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
		
		
	}

}
