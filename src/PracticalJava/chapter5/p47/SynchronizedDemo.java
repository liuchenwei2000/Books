/**
 * 
 */
package chapter5.p47;

/**
 * synchronized�÷�ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-9
 */
public class SynchronizedDemo {

	/**
	 * synchronized����static����
	 */
	public synchronized static void method1() {
		// ...
	}

	/**
	 * synchronized����Class������
	 */
	public void method2() {
		synchronized (SynchronizedDemo.class) {
			// ...
		}
	}
}