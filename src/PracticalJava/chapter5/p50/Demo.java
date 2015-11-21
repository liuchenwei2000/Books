/**
 * 
 */
package chapter5.p50;

/**
 * 示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-13
 */
public class Demo {

	/**
	 * 这是一个典型的例子。
	 * 
	 * 如果程序按照下面的顺序依次发生：
	 * 1，t1调用setValue，传入数值1。
	 * 2，t2调用setValue，传入数值2。
	 * 3，t1调用getValue，返回数值1。
	 * 
	 * 因为变量value存储于各线程的私有专用副本中，所以不能保证与主内存的正本维持一致。
	 * 在第1步中，线程1在自己的专用副本中放置了数值1。
	 * 在第2步中，线程2又在自己的专用副本中放置了数值2。
	 * 到了第3步，线程1从其专用副本中读取数值，返回1.
	 * 这些数值没有机会与主内存的正本一致化。
	 */
	public static void main(String[] args) {
		final Foo foo = new Foo();// 同一个对象
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				foo.setValue(1);// 1
				foo.getValue();// 3
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				foo.setValue(2);// 2
			}
		});
		
		t1.start();
		t2.start();
	}
}

class Foo {
	
	// 这个变量就会被线程共享
	private int value;

	// 下面两个方法实现本身是不可分割的，但仍然会导致并发问题。
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
