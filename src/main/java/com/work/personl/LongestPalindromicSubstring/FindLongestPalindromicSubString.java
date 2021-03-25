package com.work.personl.LongestPalindromicSubstring;

import org.springframework.stereotype.Service;

@Service
public class FindLongestPalindromicSubString {
	
	public String longestPAlindromicSubString(String inputString) {
		System.out.println("Given input string: " + inputString);
		
		int maxLength = 1;
		 
        int start = 0;
        int len = inputString.length();
 
        int low, high;
        
        for (int i = 1; i < len; ++i) {
            
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && 
            		inputString.charAt(low) == inputString.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
 
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && 
            		inputString.charAt(low) == inputString.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
		
        String output = inputString.substring(start, start + maxLength);
        
        System.out.println("Output: " + output);
		
		
		return output;
	}

}
