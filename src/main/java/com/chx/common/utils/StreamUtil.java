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
 * @Description: ������
 * @author: MACHENIKE
 * @date: 2020��3��1�� ����1:31:01
 */
public class StreamUtil {

	
	//��ȡInputStream���뼯����
	public static List<String> read(InputStream inputStream) throws Exception {
		//����һ������
		 List<String> list = new ArrayList<String>();
		 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		 String line="";
		 while ((line=reader.readLine())!=null) {
			list.add(line);
		}
 
		return list;
		
	}
	
	//�����ļ��ĵ�ַ��ȡ�ļ����뼯����
	public static List<String> read(String filePath) throws Exception {
		//����һ������
		FileInputStream inputStream = new FileInputStream(filePath);
	
		return read(inputStream);
		
	}
	
	//��ȡ�ļ����ݷ��뼯��
	public static List<String> read(File file) throws Exception {

		FileInputStream inputStream = new FileInputStream(file);
		return read(inputStream);
	}
	
	
	
	
	
}
