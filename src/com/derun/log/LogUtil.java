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
			if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����
				InputStreamReader read = new InputStreamReader(
				new FileInputStream(file), encoding);// ���ǵ������ʽ
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					if(lineTxt.contains("���ƺ�ʱ����")){
						int beginIndex = lineTxt.indexOf("���ƺ�ʱ����");
						int endIndex = lineTxt.indexOf("�� ����");
						String cost = lineTxt.substring(beginIndex+6, endIndex);
						int thisCost = Integer.parseInt(cost);
						if(thisCost>maxCost){
							maxCost = thisCost;
							maxLine = lineTxt;
						}
					}
				}
				System.out.println("���ʱ��");
				System.out.println(maxLine);
				read.close();
			} else {
				System.out.println("�Ҳ���ָ�����ļ�");
			}
		} catch (Exception e) {
			System.out.println("��ȡ�ļ����ݳ���");
			e.printStackTrace();
		}
	}

}
