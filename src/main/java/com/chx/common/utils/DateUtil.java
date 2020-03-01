package com.chx.common.utils;

import java.util.Calendar;
import java.util.Date;



/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: MACHENIKE
 * @date: 2020年2月28日 上午8:59:34
 */

public class DateUtil {
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据生日计算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	
	public static int getAgeByBirthday(Date birthday) {
		
		int age=0;

			Calendar now = Calendar.getInstance();
			now.setTime(new Date());//当前时间
			Calendar birth = Calendar.getInstance();
			birth.setTime(birthday);
			if (birth.after(now)) {//如果传入的时间，在当前的时间的后面 返回0岁
				age=0;
			}else {
				age=now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
				if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
					age+=1;
				}
			}
			
			return age;
	}
	
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回一个月的月末  年月日时分秒
	 * @param date
	 * @return
	 * @return: Date
	 */
	
	public static Date getEndMonth(Date date) {
		//获取一个日历类
		Calendar c = Calendar.getInstance();//默认获取当前时间日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		//让月份+1再变成月初-1秒
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());//让月份+1
		c.setTime(initMonth);//再变成月初
		c.add(Calendar.SECOND, -1);//再减一秒
		
		return c.getTime();
	}
	
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回指定日期的月初    比如2020-02-28 返回2020-02-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	
	public static Date getInitMonth(Date date) {
		//获取一个日历类
		Calendar c = Calendar.getInstance();//默认获取当前时间日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		//调用日历类的方法
		c.set(Calendar.DAY_OF_MONTH, 1);//让日期为当月的第一天
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
		
	}
	
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 日期工具类
	 * @param min  最小
	 * @param max  最大
	 * @return
	 * @return: Data
	 */

	public static Date randomDate(Date min,Date max) {
		//获取最小日期的毫秒数，从1970年到min的毫秒数
		long t1=min.getTime();
		long t2=min.getTime();
		
		if (t1>t2) {
			return null;
		}
		double d = Math.random();  //返回0-1之间的值
		long x=(long) (d *(t2 - t1 + 1)+t1);

		return  new Date(x);
		
	}
	
}
