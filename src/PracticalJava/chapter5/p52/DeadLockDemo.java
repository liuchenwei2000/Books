/**
 * 
 */
package chapter5.p52;

import chapter5.p51.Demo;

/**
 * ����ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-16
 */
public class DeadLockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] a1 = { 1, 2, 3, 4, 5 };
		final int[] a2 = { 9, 8, 7, 6, 5 };
		
		final Demo demo = new Demo();
		/*
		 * ��p51.Demo.sumArrays2(int[] a1, int[] a2)����Ϊ��������Ȼ��֤�˶��̰߳�ȫ�ԣ���������һ��Ǳ�ڵ��������塣
		 * ������һ���̶߳�ͬһ��������ô˺���ʱ����С�Ľ�����
		 * 
		 * ���£���һ���̵߳���demo�����sumArrays2�������������a1,a2��
		 * �ڶ����̵߳���demo�����sumArrays2�������������a2,a1��
		 * ����һ�����������߳̾Ϳ��ܻᷢ��������
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				demo.sumArrays2(a1, a2);
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				demo.sumArrays2(a2, a1);
			}
		}).start();
	}
}