/**
 * 
 */
package chapter5.p46;

/**
 * synchronized�÷����߽׵�ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-9
 */
public class AdvDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Foo f1 = new Foo(1);
		new Thread(f1).start();// �߳�1����
		
		Bar b = new Bar(f1);
		new Thread(b).start();// �߳�2����
		
		Foo f2 = new Foo(3);
		new Thread(f2).start();// �߳�3����
		
		/*
		 * ��ӡ���£�
		 * 1 1 1 1 3 3 3 1 1 1 1 1 1 3 3 1 1 ....
		 * 
		 * ���Կ������߳�1���߳�3������У�ȴ��Զ�������߳�1���߳�2������С�
		 * �߳�1���߳�3�����Ÿ��ԵĶ���������ܹؼ���synchronized��Ӱ�죬Ҳ����û�в������ơ�
		 * �����߳�1���߳�2������ͬһ��Foo����f1�����Ա������lockʵ��ͬ�����ơ�
		 */
	}
}

class Foo implements Runnable {

	private int value;

	public Foo(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		printValue(value);
	}

	public synchronized void printValue(int v) {
		while (true) {
			System.out.println(v);
		}
	}
}

class Bar implements Runnable {

	private Foo foo;

	public Bar(Foo foo) {
		this.foo = foo;
	}

	@Override
	public void run() {
		foo.printValue(2);
	}
}