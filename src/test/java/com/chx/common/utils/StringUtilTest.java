package com.chx.common.utils;

import org.junit.Test;

public class StringUtilTest {

	
	@Test
	public void getPlaceholderValue() {
		String src="http://news.cnstock.com/news,yw-201908-4413224.htm";
		String regex="^\\d{7}+\\.+[a-z]+$";
		String placeholderValue = StringUtil.getPlaceholderValue(src, regex);
		System.out.println(placeholderValue);
	}
	

	@Test
	public void testUrl() {
		
		boolean b = StringUtil.isHttpUrl("https://www.baidu.com/");
		boolean b2 = StringUtil.isHttpUrl("123");
		System.out.println(b);
		System.out.println(b2);
		
	}
	
	
	@Test
	public void testGetValue() {
		 String value = StringUtil.getValue("我爱我家", 2);
		// int x=1/0;
		 System.out.println(value);
		
	}
	@Test
	public void testNumber() {
		boolean b = StringUtil.isNumber("-123.123");
		System.out.println(b);
		
	}
	
	
	
	@Test
	public void testEmain() {
		boolean b = StringUtil.isEMail("348828809@qq.com");
		System.out.println(b);
		
	}
	
	@Test
	public void testPhone() {
		boolean b = StringUtil.isPhone("19710137879");
		System.out.println(b);
		
	}

	@Test
	public void testHasLength() {
		String str=" ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str=" ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtil.randomChineseString(100);
		System.out.println(c);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);	
		}
	
	
	}
	
	
	


}
