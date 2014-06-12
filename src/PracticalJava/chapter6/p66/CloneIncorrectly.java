/**
 * 
 */
package chapter6.p66;

/**
 * ����ȷ�ķ�ʽʵ��clone()
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-18
 */
public class CloneIncorrectly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Derived derived = new Derived();
		// ����������������ʱ�쳣
		Derived cloned = (Derived) derived.clone();
		System.out.println(cloned);
	}
	
	static class Base implements Cloneable {

		/**
		 * ��β�������һ�ַ�ʽʵ��clone()����
		 */
		public Object clone() {
			return new Base();
		}
	}

	/**
	 * ������û����ʵ��clone()
	 */
	static class Derived extends Base {
	}
}