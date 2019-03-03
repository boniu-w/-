package com.soft863;

public class TestPriotity extends Thread {

	public TestPriotity (String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName()+"开始了抢票 ");
		try {
			if(getPriority() <= NORM_PRIORITY) {
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+"抢到了一张票....");
	}
	
	public static void main(String[] args) {
		System.out.println("开始主线程......");
		TestPriotity tp1 = new TestPriotity("60 岁以上的老人");
		TestPriotity tp2 = new TestPriotity("年轻人");
		tp1.setPriority(6);
		tp1.start();
		tp2.start();
		System.out.println("返回");
	}

}
