/**
 * 
 */
package chapter5.p50;

/**
 * synchronizedʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-13
 */
public class SynchronizedDemo {

	class Foo {
		
		private int value;

		// ����������������synchronized���Σ��Ա�֤��ȫ��
		
		public synchronized int getValue() {
			return value;
		}

		public synchronized void setValue(int value) {
			this.value = value;
		}
	}
}