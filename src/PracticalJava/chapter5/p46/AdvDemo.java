/**
 * 
 */
package chapter5.p46;

/**
 * synchronized用法更高阶的示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-9
 */
public class AdvDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Foo f1 = new Foo(1);
		new Thread(f1).start();// 线程1启动
		
		Bar b = new Bar(f1);
		new Thread(b).start();// 线程2启动
		
		Foo f2 = new Foo(3);
		new Thread(f2).start();// 线程3启动
		
		/*
		 * 打印如下：
		 * 1 1 1 1 3 3 3 1 1 1 1 1 1 3 3 1 1 ....
		 * 
		 * 可以看到，线程1和线程3交替进行，却永远看不到线程1和线程2交替进行。
		 * 线程1和线程3操纵着各自的对象，因而不受关键词synchronized的影响，也就是没有并发控制。
		 * 但是线程1和线程2操纵着同一个Foo对象f1，所以必须对其lock实行同步控制。
		 */
	}
}

class Foo implements Runnable {

	private int value;

	public Foo(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		printValue(value);
	}

	public synchronized void printValue(int v) {
		while (true) {
			System.out.println(v);
		}
	}
}

class Bar implements Runnable {

	private Foo foo;

	public Bar(Foo foo) {
		this.foo = foo;
	}

	@Override
	public void run() {
		foo.printValue(2);
	}
}
