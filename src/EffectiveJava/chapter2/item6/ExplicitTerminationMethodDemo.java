/**
 * 
 */
package chapter2.item6;

/**
 * ��ʽ��ֹ����(Explicit Termination Method)��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-12-25
 */
public class ExplicitTerminationMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassWithExplicitTerminationMethod object = new ClassWithExplicitTerminationMethod();
		/*
		 * ��ʽ����ֹ����ͨ����try-finally�ṹ�������ʹ�ã���ȷ����ʱ��ֹ��
		 * ��finally�Ӿ��ڲ�������ʽ����ֹ�������Ա�֤��
		 * ��ʹ�ڶ���ʹ�õ�ʱ�����쳣���׳�������ֹ����Ҳ�ᱻִ�С�
		 */
		try {
			// do something using object
		} finally {
			object.terminate();
		}
	}
}

class ClassWithExplicitTerminationMethod {
	
	/**
	 * ��ʽ����ֹ����
	 */
	public void terminate(){
		// do termination
	}
}