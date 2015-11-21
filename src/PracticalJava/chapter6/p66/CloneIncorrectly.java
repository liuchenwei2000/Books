/**
 * 
 */
package chapter6.p66;

/**
 * 不正确的方式实现clone()
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public class CloneIncorrectly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Derived derived = new Derived();
		// 下面的语句会产生运行时异常
		Derived cloned = (Derived) derived.clone();
		System.out.println(cloned);
	}
	
	static class Base implements Cloneable {

		/**
		 * 这次采用了另一种方式实现clone()方法
		 */
		public Object clone() {
			return new Base();
		}
	}

	/**
	 * 派生类没有再实现clone()
	 */
	static class Derived extends Base {
	}
}
