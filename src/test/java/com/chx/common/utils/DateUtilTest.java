package com.chx.common.utils;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	
	//����
	@Test
	public void testgetAgeByBirthday() throws Exception {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date birthday = df.parse("1997-10-19 05:20:00");
		int age = DateUtil.getAgeByBirthday(birthday);
		System.out.println(age);
		
	}
	
	//��ĩ
	@Test
	public void testEndMonth() {
		Date date = DateUtil.getEndMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		
	}
	
	//�³�
	@Test
	public void testInitMonth() {
	    Date date = DateUtil.getInitMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		
	}
	
	@Test
	public void testRandomDate() {
		//��ȡ������
		Calendar c = Calendar.getInstance();
		c.set(2010,0,1);//����������
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
	}
	
}
