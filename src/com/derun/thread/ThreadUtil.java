package com.derun.thread;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadUtil extends Thread {
	
	public static String str = "ssssss";
	static int num = 0;
	private static long period = 3*1000;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerTask task = new TimerTask() {
			public void run() {
				// task to run goes here
				num++;
				System.out.println(str+num);
			}
		};
		Calendar calendar = Calendar.getInstance();
//		int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int day = calendar.get(Calendar.DAY_OF_MONTH);//每天
//		calendar.set(year, month, day, 4, 30, 00);
		//设定时间点开始执行，如果当天该时间点已过，会立即执行一次，未过则等到该时间点才执行
		calendar.set(Calendar.HOUR_OF_DAY,15);
		calendar.set(Calendar.MINUTE,51);
		calendar.set(Calendar.SECOND,0);
        Date date = calendar.getTime();
        Timer timer = new Timer();
		timer.schedule(task, date, period);
		
	}
	//新线程查看str
	public void run(){
		num++;
		str=str+num;
		System.out.println("now str is:"+str);
	}

}


