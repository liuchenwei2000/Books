/**
 * 
 */
package principle.ISP.v2.after;

/**
 * �ӿڸı���ʾ��
 * <p>
 * ��ά����������Ӧ�ó���ʱ��������ı������������Ľӿڡ�
 * ͨ����Щ�ı䶼����ɾ޴��Ӱ�죬������ʹϵͳ�ľ��󲿷���Ҫ���±���Ͳ���
 * ����Ӱ�����ͨ��Ϊ���еĶ��������½ӿڵķ��������⣬������ȥ�ı����еĽӿڡ�
 * ԭ�нӿڵĿͻ����������½ӿ��еķ���������ͨ������ȥ���ʸýӿڡ�
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
		// ���������½ӿ��еķ���������ͨ�����ַ�ʽ
		if (oi instanceof NewInterface) {
			((NewInterface) oi).operation2();
		}
	}
}

/**
 * ԭʼ�ӿ�
 * <p>
 * ԭʼ�ӿڲ��䣬�Ա��ڿͻ�������Ķ������±��롣
 */
interface OriginalInterface {

	public void operation1();
}

/**
 * �½ӿ�
 */
interface NewInterface {

	public void operation2();
}

class Class1 implements OriginalInterface {

	public void operation1() {
	}
}

class Class2 implements OriginalInterface, NewInterface {

	public void operation1() {
	}

	public void operation2() {
	}
}