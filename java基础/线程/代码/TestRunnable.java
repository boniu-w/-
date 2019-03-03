package com.soft863;

public class TestRunnable implements Runnable {

	private String name ="";
	
	public TestRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name+"�������������");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"�����˺��������");
	}

	public static void main(String[] args) {
		System.out.println("��ʼ���߳�......");
		TestRunnable tr1 = new TestRunnable("a");
		TestRunnable tr2 = new TestRunnable("b");
		TestRunnable tr3 = new TestRunnable("c");
		new Thread(tr1).start();
		new Thread(tr2).start();
		new Thread(tr3).start();
		System.out.println("����");
	}

}
