/**
 * 
 */
package chapter6.p68;

/**
 * �ڹ��캯���е���non-final������ɵĴ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-18
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Derived derived = new Derived();
		// ����������value = 0
		System.out.println("value = " + derived.getValue());
		/*
		 * ��⣺
		 * ������Derived�����ʱ�򣬻������Զ�����Base�Ĺ��캯��������lookup()�����ͱ������ˡ�
		 * ��ִ��Ȩ����Derived��lookupʱ(��̬)��Derived�����ʵ��������ʼ����δ���У����е�ʵ����������Ĭ��ֵ��
		 * ���Ե�ʱDerived.number��ֵΪ0������0�ͱ�������Base.value��
		 * 
		 * �����캯������non-final����ʱ�����п��ܷ������ִ���
		 * ����ú�����һ�������า�ǣ����Ҹú�������һ����ʵ��������ʼ���ڼ�ű���ʼ����ֵ���ͻ��������
		 */
	}
}

class Base {

	private int value;

	public Base() {
		this.value = lookup();
	}

	/**
	 * ����һ��public�ķ�final���������һᱻ���캯�����á�
	 */
	public int lookup() {
		// �����ѯ���ݿ�
		int v = lookupDB();
		return v;
	}

	private int lookupDB() {
		return 5;
	}

	public int getValue() {
		return value;
	}
}

class Derived extends Base {

	private int number = 10;

	/**
	 * ��������д��lookup����
	 */
	public int lookup() {
		return number;
	}
}