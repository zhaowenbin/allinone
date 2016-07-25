package com.derun.thread;


public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadUtil tu = new ThreadUtil();
		tu.start();
		tu.sleep(1000);
		ThreadUtil tu2 = new ThreadUtil();
		tu2.start();
		tu2.sleep(1000);
		ThreadUtil tu3 = new ThreadUtil();
		tu3.start();
		tu3.sleep(1000);
		ThreadUtil tu4 = new ThreadUtil();
		tu4.start();
	}

}


