package com.work.personl.LongestPalindromicSubstring;

import org.apache.commons.lang3.StringUtils;

public class BinaryReversal {
	
	public static String binaryReversal(String input) {
		System.out.println("input:" + input);
		String binaryInput = Integer.toBinaryString(Integer.parseInt(input));
		System.out.println("binaryInput:" + binaryInput);
		
		StringBuilder binaryInputAfterPadding = new StringBuilder(StringUtils.leftPad(binaryInput, 8, "0"));
		
		System.out.println("binaryInput after padding:" + binaryInputAfterPadding);
				
		return String.valueOf(Integer.parseInt(binaryInputAfterPadding.reverse().toString(), 2));
	}
	
	public static void main(String[] args) {
		String output = binaryReversal("47");
		System.out.println("Output:" + output);
	}

}
