/**
 * 
 */
package chapter5.item22;

import java.io.Serializable;

/**
 * ����ģʽʵ����ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-3-13
 */
public class StrategyDemo {
}

/**
 * �Ƚ����ӿ�(���Խӿ�)
 */
interface Comparator {

	public int compare(Object o1, Object o2);
}

/**
 * �ַ������ȱȽ����ĵ�һ��ʵ��
 */
class StringLengthComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((String) o1).length() - ((String) o2).length();
	}
}

/**
 * �ַ������ȱȽ����ĵڶ���ʵ��
 * <p>
 * ��Ϊһ�����͵ľ�������࣬StringLengthComparator����״̬�ģ�
 * ��û������������������ʵ���ڹ����϶����໥�ȼ۵ġ�
 * ��ˣ�����Ϊһ������(singleton)�Ƿǳ����ʵģ��Ӷ���ʡ����Ҫ�Ķ��󴴽�������
 */
class StringLengthComparator2 implements Comparator {

	/** ���� */
	public static final StringLengthComparator2 INSTANCE = new StringLengthComparator2();

	private StringLengthComparator2() {
	}

	@Override
	public int compare(Object o1, Object o2) {
		return ((String) o1).length() - ((String) o2).length();
	}
}

/**
 * �ַ������ȱȽ����ĵ�����ʵ��
 * <p>
 * ��Ϊ���Խӿڱ��������о������ʵ�������ͣ����Բ�����ҪΪ�˵���һ�������������Ѿ�����������ɹ��еġ�
 * �෴����������Ե���һ�����еľ�̬����߾�̬����������������Ϊ���Խӿڣ����Ҿ��������������������һ��˽��Ƕ���ࡣ
 * <p>
 * String��ʹ��������ģʽ��ͨ������String.CASE_INSENSITIVE_ORDER�򵼳�һ����Сд�����еıȽ�����
 */
class Host {

	/** ���� */
	public static final Comparator STRING_LENGTH_COMPARATOR = new StringLengthComparator3();

	/**
	 * ˽��Ƕ����
	 * <p>
	 * ����ʹ�õ��Ǿ�̬��Ա�࣬�����������࣬�Ա�����þ�����������ʵ�ֵڶ����ӿڡ�
	 */
	private static class StringLengthComparator3 implements Comparator, Serializable  {

		private static final long serialVersionUID = 1L;

		@Override
		public int compare(Object o1, Object o2) {
			return ((String) o1).length() - ((String) o2).length();
		}
	}
}