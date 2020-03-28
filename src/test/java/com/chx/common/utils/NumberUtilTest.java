package com.chx.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	
	
	@Test
	public void getPercent() {
		/**
		 * 保留整数  int类型
		 */
		int num = NumberUtil.getPercent(51, 68);
		System.out.println(num);
		
	}
	
	
	@Test
	public void testProportionIntIntegerInteger() {
		/**
		 * 保留整数  int类型
		 */
		String num = NumberUtil.proportionInt(39, 68);
		System.out.println(num);

	}

	@Test
	public void testProportionIntFloatFloat() {
		/**
		 * 保留整数  Float类型
		 */
		String num = NumberUtil.proportionInt(25, 73);
		System.out.println(num);
	}

	@Test
	public void testProportionDoubleIntegerIntegerInteger() {
		
		/**
		 * 保留n个小数  Integer类型
		 */
		String num = NumberUtil.proportionDouble(25, 97, 2);
		System.out.println(num);
	}

	@Test
	public void testProportionDoubleFloatFloatInteger() {
		/**
		 * 保留n个小数  Float类型
		 */
		String num = NumberUtil.proportionDouble(25, 97, 3);
		System.out.println(num);
	}

	@Test
	public void testDoubleBit() {

	     // 保留n为小数
	    
		Double num = NumberUtil.doubleBit(56.2, 2);
		System.out.println(num);
		
	}

	@Test
	public void testDoubleBitWhole() {
		
		//保留n位小数,小数不足补0
		Double num = NumberUtil.doubleBitWhole(56.9, 6);
		System.out.println(num);
	}

}
