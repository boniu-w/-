package com.soft863;

/** 
* ������������߳������������
* 
*/
public class ThreadA {

    public static void main(String[] args) throws InterruptedException{
        ThreadB b = new ThreadB();
        //���������߳�
        b.start(); 
        //�߳�Aӵ��b�����ϵ������߳�Ϊ�˵���wait()��notify()���������̱߳������Ǹ���������ӵ����
        synchronized (b) {
            System.out.println("�ȴ�����b��ɼ��㡣����");
            //��ǰ�߳�A�ȴ�
            b.wait();
            System.out.println("b���������ܺ��ǣ�" + b.total);
        } 
    } 

}

