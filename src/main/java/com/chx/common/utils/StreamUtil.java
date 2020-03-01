package com.chx.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: MACHENIKE
 * @date: 2020年3月1日 下午1:31:01
 */
public class StreamUtil {

	
	//读取InputStream放入集合中
	public static List<String> read(InputStream inputStream) throws Exception {
		//声明一个集合
		 List<String> list = new ArrayList<String>();
		 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		 String line="";
		 while ((line=reader.readLine())!=null) {
			list.add(line);
		}
 
		return list;
		
	}
	
	//根据文件的地址读取文件放入集合中
	public static List<String> read(String filePath) throws Exception {
		//声明一个集合
		FileInputStream inputStream = new FileInputStream(filePath);
	
		return read(inputStream);
		
	}
	
	//读取文件内容放入集合
	public static List<String> read(File file) throws Exception {

		FileInputStream inputStream = new FileInputStream(file);
		return read(inputStream);
	}
	
	
	
	
	
}
