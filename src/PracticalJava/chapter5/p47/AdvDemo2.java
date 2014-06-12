/**
 * 
 */
package chapter5.p47;

/**
 * synchronized�߽׵�ʾ��2
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-9
 */
public class AdvDemo2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Bar b1 = new Bar();
		new Thread(b1).start();// ���߳�����
		b1.printM2(b1);// ���߳���ִ��
		
		/*
		 * ��ӡ���£�
		 * 1 1 1 1 2 2 2 1 1 1 1 1 2 2 2 1 1 ....
		 * 
		 * ���Կ�����������ӡ��������ִ���ˡ�
		 * ������ΪprintM1()������ȡ���Ƕ���f1��lock����printM2()������ȡ����Foo.class��������lock��
		 */
	}
}

/**
 * �����Ҫͬ������Foo�����������������������������һ����Դ��
 * Ϊ�˱��������Դ�������������ȷ��ͬ�����Ա����ͻ��
 * 
 * ���Բ�������ķ��������
 * ͬ������һ�������instance������
 */
class Bar implements Runnable {

	/*
	 * ����ֻ��������������ʹ�õ�instance���������Ǹ�����
	 * Ϊʲôʹ��һ��Ԫ�ظ���Ϊ0��byte���飬��Ϊ������õ�������
	 */
	private byte[] lock = new byte[0];

	@Override
	public void run() {
		printM1();
	}

	public synchronized void printM1() {
		synchronized (lock) {
			while (true) {
				System.out.println("1");
			}
		}
	}

	public static void printM2(Bar bar) {
		synchronized (bar.lock) {
			while (true) {
				System.out.println("2");
			}
		}
	}
}