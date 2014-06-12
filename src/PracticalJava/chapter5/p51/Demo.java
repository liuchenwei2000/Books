/**
 * 
 */
package chapter5.p51;

/**
 * 示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-16
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 9, 8, 7, 6, 5 };
		// 传入函数的两个数组并非是Demo对象的instance数据
		Demo demo = new Demo();
		demo.sumArrays(a1, a2);
	}
	
	/**
	 * 这个方法虽然声明为synchronized，但仍然不具有线程安全性。
	 * 
	 * 这是因为synchronized锁定的是对象，而非函数或代码，本方法所操纵的两个数组对象并没有被锁定。
	 * 当另一个线程改变未锁定之对象的时候，本函数依然可以执行，结果就错了。
	 */
	public synchronized int sumArrays(int[] a1, int[] a2) {
		int value = 0;
		int length = a1.length;
		if (length == a2.length) {
			for (int i = 0; i < length; i++) {
				value += a1[i] + a2[i];
			}
		}
		return value;
	}
	
	/**
	 * 所以，有时候仅仅同步控制一个函数是不够的，还必须同步控制此函数所处理的对象。
	 * 本方法对函数中操作的每一个对象都加锁控制，保证了线程安全性。
	 */
	public int sumArrays2(int[] a1, int[] a2) {
		int value = 0;
		int length = a1.length;
		if (length == a2.length) {
			synchronized (a1) {
				synchronized (a2) {
					for (int i = 0; i < length; i++) {
						value += a1[i] + a2[i];
					}
				}
			}
		}
		return value;
	}
}