/**
 * 
 */
package chapter6.p65.e2;

/**
 * �ͻ��˲����� 
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
		MutableCircle mc = new MutableCircle(5);
		useMutable(mc);
		
		ImmutableCircle ic = new ImmutableCircle(5);
		useImmutable(ic);
		// ��ʱת��(cast)���޷����ƿɱ����ˣ�����������б����
		// useMutable((MutableCircle) ic);
		
		useCircle(mc);
		useCircle(ic);
	}

	/**
	 * ��Ҫ�ɱ����ĺ���
	 */
	public static void useMutable(MutableCircle mc) {
	}

	/**
	 * ��Ҫ���ɱ����ĺ���
	 */
	public static void useImmutable(ImmutableCircle mc) {
	}

	/**
	 * ���ں�����ɱ��Եĺ���
	 */
	public static void useCircle(Circle c) {
	}
}