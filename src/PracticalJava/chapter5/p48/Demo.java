/**
 * 
 */
package chapter5.p48;

/**
 * 封装不好导致类不具有多线程安全性示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-11
 */
public class Demo {
}

class Foo {
	
	/* 
	 * 这个地方如果不是private修饰的话，那类用户将会直接使用array变量，
	 * 造成数据可被直接修改，则类不再具有线程安全性。
	 */
	private int[] array = new int[10];
	
	public synchronized void add(int[] other) {
		for (int i = 0; i < array.length; i++) {
			array[i] += other[i];
		}
	}
	
	public synchronized void sub(int[] other){
		for (int i = 0; i < array.length; i++) {
			array[i] -= other[i];
		}
	}
	
	/**
	 * 如果提供这类的访问函数，那就会使得类用户又可以直接操作array数据，不再具有线程安全性。
	 * 修改方法是使用下面的实现方式，将array的克隆版本返回给类用户。
	 */
	public int[] getArray() {
		return array;
	}
	
	/**
	 * 本方法必须声明为synchronized，以确保array在克隆过程中不被篡改。
	 * 添加的克隆行为会带来一些开销，但这是线程安全性所必需的。
	 */
	public synchronized int[] getArray2() {
		return array.clone();
	}
}
