/**
 * 
 */
package chapter6.p66;

/**
 * 正确的方式实现clone()
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public class CloneCorrectly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Derived derived = new Derived();
		// Object.clone()确保得以创建出正确的Derive对象
		Derived cloned = (Derived) derived.clone();
		System.out.println(cloned);
	}
	
	static class Base implements Cloneable {

		/**
		 * 首先调用super.clone()
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
	 * 派生类没有再实现clone()
	 */
	static class Derived extends Base {
	}
}