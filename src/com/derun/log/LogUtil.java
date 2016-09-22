package com.derun.log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LogUtil {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String logFilePath = "C:\\Users\\Administrator\\Desktop\\server_4.log";
		//String logFilePath = "C:\\Users\\Administrator\\Desktop\\ccslog.2016-04-26";
		scanLog(logFilePath);
	}
	
	public static void scanLog(String logFilePath) {
		try {
			int maxCost = 0;
			String maxLine = "";
			String encoding = "GBK";
			File file = new File(logFilePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
				new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					if(lineTxt.contains("共计耗时：【")){
						int beginIndex = lineTxt.indexOf("共计耗时：【");
						int endIndex = lineTxt.indexOf("】 毫秒");
						String cost = lineTxt.substring(beginIndex+6, endIndex);
						int thisCost = Integer.parseInt(cost);
						if(thisCost>maxCost){
							maxCost = thisCost;
							maxLine = lineTxt;
						}
					}
				}
				System.out.println("最长耗时：");
				System.out.println(maxLine);
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
	}

}
