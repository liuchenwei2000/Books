/**
 * 
 */
package chapter3.p20;

/**
 * 不同的throws声明方式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-26
 */
public class Demo {

	/**
	 * 这种方式的throws子句会让客户端迷惑
	 */
	public void foo(int i) throws Exception1 {
		if (i == 1) {
			throw new Exception1();
		}
		if (i == 2) {
			throw new Exception2();
		}
		if (i == 3) {
			throw new Exception3();
		}
	}
	
	/**
	 * 这种方式的throws子句才是提倡的
	 */
	public void bar(int i) throws Exception1, Exception2, Exception3 {
		if (i == 1) {
			throw new Exception1();
		}
		if (i == 2) {
			throw new Exception2();
		}
		if (i == 3) {
			throw new Exception3();
		}
	}
}

class Exception1 extends Exception {
	private static final long serialVersionUID = 1L;
}

class Exception2 extends Exception1 {
	private static final long serialVersionUID = 1L;
}

class Exception3 extends Exception2 {
	private static final long serialVersionUID = 1L;
}
