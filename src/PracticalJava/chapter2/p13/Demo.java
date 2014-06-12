/**
 * 
 */
package chapter2.p13;

/**
 * ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-22
 */
public class Demo {
}

/**
 * ʵ����equals()�Ļ���
 */
class Base {
	
	private int value;

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && getClass() == obj.getClass()) {
			Base other = (Base) obj;
			return value == other.value;
		}
		return false;
	}
}

/**
 * ��ͳ��ʽʵ��equals()��������
 */
class Derived1 extends Base {
	
	private int number;
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
			Derived1 other = (Derived1) obj;
			return number == other.number;
		}
		return false;
	}
}

/**
 * �򻯷�ʽʵ��equals()��������
 * <p>
 * ����������ּ򻯷�ʽ�������û����Դ�룬ȷ�������������ʵ���鹤����
 * �������ּ򻯷�ʽʹ�㲻�ò��е�ĳЩ���ա������������п�����Ϊδ��classes�̳���ϵ���޸Ķ��ܵ��𻵡�
 * ���ԣ�ֻ�е�ɾ����Щ�����뽫�������ֵ��������������Ҿ���û�к������յ�����£��Ż�ʹ������ʵ�ַ�ʽ��
 */
class Derived2 extends Base {
	
	private int number;
	
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			Derived2 other = (Derived2) obj;
			return number == other.number;
		}
		return false;
	}
}