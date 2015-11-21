/**
 * 
 */
package chapter4.p33;

/**
 * 未用上的对象情形示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-1
 */
public class UnusedObjects {

	/**
	 * 这种写法将会为创建两个对象付出代价：
	 * 因为无论执行函数中的哪一个路线，总有一个对象没被用上。
	 */
	public String fooWithUnusedObject(int i) {
		String s = i + "";
		String zero = "零";
		if (i == 0) {
			return zero;
		} else {
			return s;
		}
	}
	
	/**
	 * 这种写法只在需要的时候才创建对象，因为对象的创建成本是非常昂贵的。
	 */
	public String foo(int i) {
		if (i == 0) {
			String zero = "零";
			return zero;
		} else {
			String s = i + "";
			return s;
		}
	}
}
