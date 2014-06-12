/**
 * 
 */
package chapter5.p46;

/**
 * synchronized用法示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-9
 */
public class SynchronizedDemo {

	/**
	 * synchronized修饰方法
	 */
	public synchronized void method1() {
		// ...
	}

	/**
	 * synchronized修饰对象
	 * <p>
	 * 本方法和上面的方法在对象锁定方面功能一致，虽然代码数量和执行方式有所不同。
	 * 两者都是对this进行同步控制，换句话说，获得的lock将给予调用此函数的对象(也就是this)。
	 */
	public void method2() {
		synchronized (this) {
			// ...
		}
	}

	/**
	 * synchronized修饰对象
	 * <p>
	 * 本方法同步控制object所指的那个对象。
	 */
	public void method3(Object object) {
		synchronized (object) {
			// ...
		}
	}
}