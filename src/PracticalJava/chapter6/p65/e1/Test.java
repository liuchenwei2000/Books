/**
 * 
 */
package chapter6.p65.e1;

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
		ImmutableCircle ic = createCircle(3);
		// ����������б����
		// ic.setRedius(5);
		/*
		 * ����immutable interface������¶�˵ײ�class�ķǿɱ亯��������
		 * ͨ�����interface���ʵ�objects�ܱ��ֲ����ԡ�
		 * ���ǣ��û���Ȼ����ʹ�ü򵥵�ת��(cast)�����������������ԣ����£�
		 */
		((MutableCircle) ic).setRedius(5);
	}
	
	public static ImmutableCircle createCircle(double r){
		return new MutableCircle(r);
	}
}