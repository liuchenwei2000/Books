/**
 * 
 */
package chapter5.p50;

/**
 * synchronized示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-13
 */
public class SynchronizedDemo {

	class Foo {
		
		private int value;

		// 下面两个方法都用synchronized修饰，以保证安全。
		
		public synchronized int getValue() {
			return value;
		}

		public synchronized void setValue(int value) {
			this.value = value;
		}
	}
}
