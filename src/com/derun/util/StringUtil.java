package com.derun.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getUkey());
	}
	
	public static String getUkey(){
		String uKey;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		uKey = sdf.format(new Date());
		return uKey;
	}

}
