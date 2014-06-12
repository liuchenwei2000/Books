/**
 * 
 */
package principle.ISP.v1;

/**
 * �ӿڸı���ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-11-1
 */
public class InterfaceChangeDemo {
}

/**
 * �ͻ��˳���
 */
class Client {

	/**
	 * ����OriginalInterface�ķ���
	 */
	public void operation(OriginalInterface oi) {
		oi.operation1();
	}
}

/**
 * ԭʼ�ӿ�
 */
interface OriginalInterface {

	public void operation1();
}

class Class1 implements OriginalInterface {

	public void operation1() {
	}
}

class Class2 implements OriginalInterface {

	public void operation1() {
	}
}