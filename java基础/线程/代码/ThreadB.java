package com.soft863;

/** 
* ����1+2+3 ... +100�ĺ�
* 
*/ 
public class ThreadB extends Thread {
    
	int total; 

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 101; i++) {
                total += i; 
            } 
            //����ɼ����ˣ������ڴ˶���������ϵȴ��ĵ����̣߳��ڱ������߳�A������
            notify(); 
            System.out.println("�������");
        } 
    } 
}
