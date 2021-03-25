package com.work.personl.LongestPalindromicSubstring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LongestPalindromicSubstringController {
	
	@Autowired
	FindLongestPalindromicSubString findLongestPalindromicSubString;
	
	@RequestMapping("/{inputString}")
    public String getEmployees(@PathVariable String inputString) 
    {		
		return "output: " + findLongestPalindromicSubString.longestPAlindromicSubString(inputString);
    }

}
