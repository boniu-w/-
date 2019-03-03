package com.soft863;

public class TestSychronizied implements Runnable {

	int ticket = 100;
	@Override
	public void run() {
		
		System.out.println("你开始抢票了。。。。");
		
		try {
			while(true) {
				synchronized(this) {
					if( ticket>0 ) {
						ticket --;
					}
					Thread.sleep((int)(Math.random()*500));					
					System.out.println(Thread.currentThread().getName()+"抢到票了第"+ticket+"张");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		TestSychronizied ts1 = new TestSychronizied();
		
		Thread t1 = new Thread(ts1);
		Thread t2 = new Thread(ts1);
		t1.start();
		t2.start();
	}

}
