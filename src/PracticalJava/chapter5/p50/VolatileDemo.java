/**
 * 
 */
package chapter5.p50;

/**
 * volatileʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-13
 */
public class VolatileDemo {

	class Foo {
		
		// �������ʹ��volatile���Σ��Ա�֤��ȫ��
		private volatile int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
}