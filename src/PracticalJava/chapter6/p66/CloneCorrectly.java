/**
 * 
 */
package chapter6.p66;

/**
 * ��ȷ�ķ�ʽʵ��clone()
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-18
 */
public class CloneCorrectly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Derived derived = new Derived();
		// Object.clone()ȷ�����Դ�������ȷ��Derive����
		Derived cloned = (Derived) derived.clone();
		System.out.println(cloned);
	}
	
	static class Base implements Cloneable {

		/**
		 * ���ȵ���super.clone()
		 */
		public Object clone() {
			try {
				return super.clone();
			} catch (CloneNotSupportedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * ������û����ʵ��clone()
	 */
	static class Derived extends Base {
	}
}