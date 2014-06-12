/**
 * 
 */
package chapter5.p50;

/**
 * volatile示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-13
 */
public class VolatileDemo {

	class Foo {
		
		// 共享变量使用volatile修饰，以保证安全。
		private volatile int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
}