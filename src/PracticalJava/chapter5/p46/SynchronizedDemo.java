/**
 * 
 */
package chapter5.p46;

/**
 * synchronized�÷�ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-9
 */
public class SynchronizedDemo {

	/**
	 * synchronized���η���
	 */
	public synchronized void method1() {
		// ...
	}

	/**
	 * synchronized���ζ���
	 * <p>
	 * ������������ķ����ڶ����������湦��һ�£���Ȼ����������ִ�з�ʽ������ͬ��
	 * ���߶��Ƕ�this����ͬ�����ƣ����仰˵����õ�lock��������ô˺����Ķ���(Ҳ����this)��
	 */
	public void method2() {
		synchronized (this) {
			// ...
		}
	}

	/**
	 * synchronized���ζ���
	 * <p>
	 * ������ͬ������object��ָ���Ǹ�����
	 */
	public void method3(Object object) {
		synchronized (object) {
			// ...
		}
	}
}