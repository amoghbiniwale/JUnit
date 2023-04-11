package com.aurionpro.model;

public class StringUtil {

	public String truncateAinFirst2Position(String str) {				
		if(str.length()<=2&&str!=null) {
			str.replace("A", "");
		}
		else {
			String str1=str.substring(0,2).replace("A", "");
			String str2 =str.substring(2);
			str=str1+str2;
		}
		return str;
	}

	public boolean areFirstAndLastTwoCharectersTheSame(String str) {
		return false;
		

	}

}
