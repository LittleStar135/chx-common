package com.chx.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;


public class RandomUtil {

	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		
		Random r = new Random();
		int i = r.nextInt(max-min+1)+min;  // nextInt(3) 返回的0 1 2

		return i;
	
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	//应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		//声明数组,用来存放返回的随机数
		int [] x=new int[subs];
		//用来过滤重复的数据
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()!=subs) {
			int i = random(min, max);
			set.add(i);
		}
		//遍历set 把值放入数组
		int k=0;
		for (Integer i : set) {
			x[k]=i;
			k++;
		}
		
		return x;
	
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		
		
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPPPPASDFGHJKLZXCVBNM";
		int i = random(0, str.length()-1);
		char charAt = str.charAt(i);
		return charAt;
	
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		
		String str="";
		
		for (int i = 0; i < length; i++) {
			str+= randomCharacter();
		}
		
		return str;

	}

	/** 
     * 返回手机号码 
     */  
	public static String randomPhone(){
		   
	       
        String number = "13";//定义电话号码以139开头
        Random random = new Random();//定义random，产生随机数
        for (int j = 0; j < 9; j++) {
            //生成0~9 随机数
            number += random.nextInt(9);
        }
    
        return number;
	

	}
	
	//随机返回性别
	public static String randomSex(){
		String[] str= {"女","男"};
		//姓氏 从数组随机获取一个
		String sex = str[RandomUtil.random(0, str.length-1)];
		
		return sex;
	}
	
	//随机生成一个长度范围内的email
	public static String randomEmail(){
		
		int num=random(3, 20);
		
		String email="";
		
		for (int i = 0; i < num; i++) {
			email+= randomCharacter();
		}
		String[] str= {"@qq.com","@163.com","@sian.com","@gmail.com","@sohu.com","@hotmail.com"};
		//姓氏 从数组随机获取一个
		String email2 = str[RandomUtil.random(0, str.length-1)];
		
		return email+email2;

	}
	

	 public static String randomDateBetweenMinAndMax(){
	        Calendar calendar = Calendar.getInstance();
	        //注意月份要减去1
	        calendar.set(1950,01,01);
	        calendar.getTime().getTime();
	        //根据需求，这里要将时分秒设置为0
	        calendar.set(Calendar.HOUR_OF_DAY, 0);
	        calendar.set(Calendar.MINUTE, 0);
	        calendar.set(Calendar.SECOND,0);
	        long min = calendar.getTime().getTime();;
	        calendar.set(2002,01,01);
	        calendar.set(Calendar.HOUR_OF_DAY,0);
	        calendar.set(Calendar.MINUTE,0);
	        calendar.set(Calendar.SECOND,0);
	        calendar.getTime().getTime();
	        long max = calendar.getTime().getTime();
	        //得到大于等于min小于max的double值
	        double randomDate = Math.random()*(max-min)+min;
	        //将double值舍入为整数，转化成long类型
	        calendar.setTimeInMillis(Math.round(randomDate));
	        
	        Date date = calendar.getTime();
	        
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        String birthday = df.format(date);

	        return birthday;

	 }
	
}
