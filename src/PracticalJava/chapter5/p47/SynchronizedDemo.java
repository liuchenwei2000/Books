/**
 * 
 */
package chapter5.p47;

/**
 * synchronized用法示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-9
 */
public class SynchronizedDemo {

	/**
	 * synchronized修饰static方法
	 */
	public synchronized static void method1() {
		// ...
	}

	/**
	 * synchronized修饰Class字面量
	 */
	public void method2() {
		synchronized (SynchronizedDemo.class) {
			// ...
		}
	}
}