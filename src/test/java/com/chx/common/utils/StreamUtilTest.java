package com.chx.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testRead() throws Exception {
		
		List<String> list = StreamUtil.read(new File("C:\\Users\\MACHENIKE\\Desktop\\新建文本文档.txt"));
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
