/**
 * 
 */
package principle.ISP.v2;

/**
 * �ӿڸı���ʾ��
 * <p>
 * ��ά����������Ӧ�ó���ʱ��������ı������������Ľӿڡ�
 * ͨ����Щ�ı䶼����ɾ޴��Ӱ�죬������ʹϵͳ�ľ��󲿷���Ҫ���±���Ͳ���
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
		oi.operation2();
	}
}

/**
 * ԭʼ�ӿ�
 * <p>
 * �ӿڸı��ˣ��¼���һ����������͵������е�ʵ���඼Ҫ���±���
 */
interface OriginalInterface {

	public void operation1();
	
	public void operation2();
}

class Class1 implements OriginalInterface {

	public void operation1() {
	}

	public void operation2() {
	}
}

class Class2 implements OriginalInterface {

	public void operation1() {
	}

	public void operation2() {
	}
}