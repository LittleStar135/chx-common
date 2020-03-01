package com.chx.common.utils;

import java.util.Calendar;
import java.util.Date;



/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: MACHENIKE
 * @date: 2020��2��28�� ����8:59:34
 */

public class DateUtil {
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: �������ռ�������
	 * @param date
	 * @return
	 * @return: int
	 */
	
	public static int getAgeByBirthday(Date birthday) {
		
		int age=0;

			Calendar now = Calendar.getInstance();
			now.setTime(new Date());//��ǰʱ��
			Calendar birth = Calendar.getInstance();
			birth.setTime(birthday);
			if (birth.after(now)) {//��������ʱ�䣬�ڵ�ǰ��ʱ��ĺ��� ����0��
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
	 * @Description: ����һ���µ���ĩ  ������ʱ����
	 * @param date
	 * @return
	 * @return: Date
	 */
	
	public static Date getEndMonth(Date date) {
		//��ȡһ��������
		Calendar c = Calendar.getInstance();//Ĭ�ϻ�ȡ��ǰʱ��������
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//���·�+1�ٱ���³�-1��
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());//���·�+1
		c.setTime(initMonth);//�ٱ���³�
		c.add(Calendar.SECOND, -1);//�ټ�һ��
		
		return c.getTime();
	}
	
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: ����ָ�����ڵ��³�    ����2020-02-28 ����2020-02-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	
	public static Date getInitMonth(Date date) {
		//��ȡһ��������
		Calendar c = Calendar.getInstance();//Ĭ�ϻ�ȡ��ǰʱ��������
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//����������ķ���
		c.set(Calendar.DAY_OF_MONTH, 1);//������Ϊ���µĵ�һ��
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
		
	}
	
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: ���ڹ�����
	 * @param min  ��С
	 * @param max  ���
	 * @return
	 * @return: Data
	 */

	public static Date randomDate(Date min,Date max) {
		//��ȡ��С���ڵĺ���������1970�굽min�ĺ�����
		long t1=min.getTime();
		long t2=min.getTime();
		
		if (t1>t2) {
			return null;
		}
		double d = Math.random();  //����0-1֮���ֵ
		long x=(long) (d *(t2 - t1 + 1)+t1);

		return  new Date(x);
		
	}
	
}
