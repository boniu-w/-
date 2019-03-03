package com.soft863;

public class TestPriotity extends Thread {

	public TestPriotity (String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName()+"��ʼ����Ʊ ");
		try {
			if(getPriority() <= NORM_PRIORITY) {
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+"������һ��Ʊ....");
	}
	
	public static void main(String[] args) {
		System.out.println("��ʼ���߳�......");
		TestPriotity tp1 = new TestPriotity("60 �����ϵ�����");
		TestPriotity tp2 = new TestPriotity("������");
		tp1.setPriority(6);
		tp1.start();
		tp2.start();
		System.out.println("����");
	}

}
