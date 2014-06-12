/**
 * 
 */
package chapter2.item6;

/**
 * �սắ������ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-12-25
 */
public class FinalizerChainingDemo {
}

class BaseClass {

	protected void finalize() throws Throwable {
		// do something
	}
}

class SubClass extends BaseClass {

	/**
	 * ������սắ��
	 */
	protected void finalize() throws Throwable {
		/*
		 * Ӧ����һ��try�����ս����࣬�����ڶ�Ӧ��finally���е��ó�����սắ���� 
		 * �����ܱ�֤��ʹ������ս�����׳����쳣��������սắ��Ҳ�ᱻִ�У���֮��Ȼ��
		 */
		try {
			// do something
		} finally {
			super.finalize();
		}
	}
}