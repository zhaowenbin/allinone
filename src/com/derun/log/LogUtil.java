package com.derun.log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LogUtil {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String logFilePath = "C:\\Users\\wbzhao\\Desktop\\2017021417_managedserver_1.log";
		scanBigFile(logFilePath);
		 logFilePath = "C:\\Users\\wbzhao\\Desktop\\2017021417_managedserver_2.log";
		scanBigFile(logFilePath);
		 logFilePath = "C:\\Users\\wbzhao\\Desktop\\2017021417_managedserver_3.log";
		scanBigFile(logFilePath);
		 logFilePath = "C:\\Users\\wbzhao\\Desktop\\2017021417_managedserver_4.log";
		scanBigFile(logFilePath);
	}
	
	public static void scanBigFile(String path) throws IOException {
		FileInputStream inputStream = null;
		Scanner sc = null;
		int maxCost = 0;
		String maxLine = "";
		try {
		    inputStream = new FileInputStream(path);
		    sc = new Scanner(inputStream, "GBK");
		    while (sc.hasNextLine()) {
		        String lineTxt = sc.nextLine();
				if(lineTxt!=null && lineTxt.contains("���ƺ�ʱ����")){
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
		    // note that Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} finally {
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
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
