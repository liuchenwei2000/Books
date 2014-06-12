/**
 * 
 */
package chapter5.p47;

/**
 * synchronized高阶的示例2
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-9
 */
public class AdvDemo2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Bar b1 = new Bar();
		new Thread(b1).start();// 此线程启动
		b1.printM2(b1);// 主线程中执行
		
		/*
		 * 打印如下：
		 * 1 1 1 1 2 2 2 1 1 1 1 1 2 2 2 1 1 ....
		 * 
		 * 可以看到，两个打印方法并发执行了。
		 * 这是因为printM1()方法获取的是对象f1的lock，而printM2()方法获取的是Foo.class这个对象的lock。
		 */
	}
}

/**
 * 如果需要同步控制Foo类的两个方法，或者两个函数共享一笔资源，
 * 为了保护这笔资源，代码必须有正确的同步，以避免冲突。
 * 
 * 可以采用下面的方法解决：
 * 同步控制一个特殊的instance变量。
 */
class Bar implements Runnable {

	/*
	 * 由于只能锁定对象，所以使用的instance变量必须是个对象。
	 * 为什么使用一个元素个数为0的byte数组，因为这是最经济的做法。
	 */
	private byte[] lock = new byte[0];

	@Override
	public void run() {
		printM1();
	}

	public synchronized void printM1() {
		synchronized (lock) {
			while (true) {
				System.out.println("1");
			}
		}
	}

	public static void printM2(Bar bar) {
		synchronized (bar.lock) {
			while (true) {
				System.out.println("2");
			}
		}
	}
}