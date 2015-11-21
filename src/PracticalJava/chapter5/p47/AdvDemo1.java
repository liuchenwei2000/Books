/**
 * 
 */
package chapter5.p47;

/**
 * synchronized高阶示例1
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-9
 */
public class AdvDemo1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Foo f1 = new Foo();
		new Thread(f1).start();// 此线程启动
		f1.printM2();// 主线程中执行
		
		/*
		 * 打印如下：
		 * 1 1 1 1 2 2 2 1 1 1 1 1 2 2 2 1 1 ....
		 * 
		 * 可以看到，两个打印方法并发执行了。
		 * 这是因为printM1()方法获取的是对象f1的lock，而printM2()方法获取的是Foo.class这个对象的lock。
		 */
	}
}

class Foo implements Runnable {

	@Override
	public void run() {
		printM1();
	}

	public synchronized void printM1() {
		while (true) {
			System.out.println("1");
		}
	}
	
	public synchronized static void printM2() {
		while (true) {
			System.out.println("2");
		}
	}
}
