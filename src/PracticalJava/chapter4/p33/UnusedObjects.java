/**
 * 
 */
package chapter4.p33;

/**
 * δ���ϵĶ�������ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-1
 */
public class UnusedObjects {

	/**
	 * ����д������Ϊ�����������󸶳����ۣ�
	 * ��Ϊ����ִ�к����е���һ��·�ߣ�����һ������û�����ϡ�
	 */
	public String fooWithUnusedObject(int i) {
		String s = i + "";
		String zero = "��";
		if (i == 0) {
			return zero;
		} else {
			return s;
		}
	}
	
	/**
	 * ����д��ֻ����Ҫ��ʱ��Ŵ���������Ϊ����Ĵ����ɱ��Ƿǳ�����ġ�
	 */
	public String foo(int i) {
		if (i == 0) {
			String zero = "��";
			return zero;
		} else {
			String s = i + "";
			return s;
		}
	}
}