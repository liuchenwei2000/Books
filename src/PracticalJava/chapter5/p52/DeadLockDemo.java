/**
 * 
 */
package chapter5.p52;

import chapter5.p51.Demo;

/**
 * 死锁示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-16
 */
public class DeadLockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] a1 = { 1, 2, 3, 4, 5 };
		final int[] a2 = { 9, 8, 7, 6, 5 };
		
		final Demo demo = new Demo();
		/*
		 * 以p51.Demo.sumArrays2(int[] a1, int[] a2)方法为例，它虽然保证了多线程安全性，但制造了一个潜在的死锁陷阱。
		 * 除非另一个线程对同一个对象调用此函数时格外小心谨慎。
		 * 
		 * 如下，第一个线程调用demo对象的sumArrays2方法，传入的是a1,a2；
		 * 第二个线程调用demo对象的sumArrays2方法，传入的是a2,a1。
		 * 这样一来，这两个线程就可能会发生死锁。
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				demo.sumArrays2(a1, a2);
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				demo.sumArrays2(a2, a1);
			}
		}).start();
	}
}
