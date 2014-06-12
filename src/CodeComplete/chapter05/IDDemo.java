/**
 * 
 */
package chapter05;

/**
 * ID��ʾ��
 * <p>
 * ��Ϣ���ص�һ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-11-7
 */
public class IDDemo {
}

/**
 * �ʼʹ��int����ʾid��id�ǵ�����
 * ��ȡһ����ID�ķ�������++id��ϵͳ�е�������������������ȡ��ID
 * һ����ȡ��ID���㷨�б仯���Ǿ���Ҫ�޸����е���Щ���
 * ����8��������Ϊid��Ԥ��һЩ�������ֲ�����Ϊid
 */
class Demo1 {

	private static int id = 0;

	public void method1() {
		// some codes
		++id;
		// some codes
	}

	public void method2() {
		// some codes
		++id;
		// some codes
	}
}

/**
 * ������ID���㷨����һ��Ӧ��������������ƾ���
 * ͨ������һ������getNewID()����װ������ID���㷨
 * ��������㷨�б仯������Ķ���Ҳ����Ӱ�쵽�������������
 * �����ַ�����Ҫ��ID��������������Ϊ�ַ�������getNewID()�ķ������;���int
 * ��ʱ��Ҫ��������ڲ����ѵ���getNewID()�ĵط���Ҫ�޸�һ��
 */
class Demo2 {

	// 
	private static int id = 0;

	public void method1() {
		// some codes
		getNewID();
		// some codes
	}

	public void method2() {
		// some codes
		getNewID();
		// some codes
	}

	private int getNewID() {
		if (++id == 8) {
			return getNewID();
		}
		return ++id;
	}
}

/**
 * ID������ͬ��Ҳ��һ����Ҫ���ص�����
 * �����͸¶ID�Ǹ�����ʵ�����ǹ������Ƕ�IDʹ����������
 * ���Դ���һ���򵥵�ID��������ID�����ͣ������ṩ���Խ�ID���ͳ�int��String�ķ���
 */
class Demo3 {

	private static int id = 0;

	public void method1() {
		// some codes
		getNewID().toInt();
		// some codes
	}

	public void method2() {
		// some codes
		getNewID().toStr();
		// some codes
	}

	private ID getNewID() {
		return new ID(getNewIDPrivate());
	}

	private int getNewIDPrivate() {
		if (++id == 8) {
			return getNewIDPrivate();
		}
		return ++id;
	}

	static class ID {

		private int id;

		public ID(int id) {
			this.id = id;
		}

		public int toInt() {
			return id;
		}

		public String toStr() {
			return String.valueOf(id);
		}
	}
}