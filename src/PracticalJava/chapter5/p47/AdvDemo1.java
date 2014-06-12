/**
 * 
 */
package chapter5.p47;

/**
 * synchronized�߽�ʾ��1
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-9
 */
public class AdvDemo1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Foo f1 = new Foo();
		new Thread(f1).start();// ���߳�����
		f1.printM2();// ���߳���ִ��
		
		/*
		 * ��ӡ���£�
		 * 1 1 1 1 2 2 2 1 1 1 1 1 2 2 2 1 1 ....
		 * 
		 * ���Կ�����������ӡ��������ִ���ˡ�
		 * ������ΪprintM1()������ȡ���Ƕ���f1��lock����printM2()������ȡ����Foo.class��������lock��
		 */
	}
}

class Foo implements Runnable {

	@Override
	public void run() {
		printM1();
	}

	public synchronized void printM1() {
		while (true) {
			System.out.println("1");
		}
	}
	
	public synchronized static void printM2() {
		while (true) {
			System.out.println("2");
		}
	}
}