package com.soft863;

public class TestThread extends Thread {

	public TestThread (String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName()+"request �������������");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+"response �����˺��������");
	}
	public static void main(String[] args) {
		System.out.println("��ʼ���߳�......");
		//����һ�����̶߳���
		TestThread th1 = new TestThread("a:");
		TestThread th2 = new TestThread("b:");
		TestThread th3 = new TestThread("c:");
		//����
		th1.start();
		th2.start();
		th2.stop();
		th3.start();
		
		System.out.println("����");
	}

}
