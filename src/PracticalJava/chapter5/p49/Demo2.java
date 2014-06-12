/**
 * 
 */
package chapter5.p49;

/**
 * 同步控制示例
 * <p>
 * 为了修正Demo1的问题，需要为一个对象配备多个locks。
 * Java自身并没有提供这样的功能，因此不得不设立自己的机制。
 * 一种做法是创建一些对象作为instance数据，这些对象仅仅用来提供locks。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-11
 */
public class Demo2 {
	
	@SuppressWarnings("unused")
	private int[] intArray;
	@SuppressWarnings("unused")
	private double[] doubleArray;
	
	private byte[] intArrayLock = new byte[0];
	private byte[] doubleArrayLock = new byte[0];
	
	/*
	 * 下面这种实现方式，使得同步控制得以发生在不同的对象身上，让并发度更高。
	 */
	
	public void modifyIntArray1() {
		synchronized (intArrayLock) {
			// 访问并操作 intArray
		}
	}

	public void modifyIntArray2() {
		synchronized (intArrayLock) {
			// 访问并操作 intArray
		}
	}

	public void modifyDoubleArray1() {
		synchronized (doubleArrayLock) {
			// 访问并操作 intArray
		}
	}

	public void modifyDoubleArray2() {
		synchronized (doubleArrayLock) {
			// 访问并操作 intArray
		}
	}
}