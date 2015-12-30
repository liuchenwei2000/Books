/**
 * 
 */
package chapter2.item2;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * singleton演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-12-18
 */
public class SingletonDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Client端如何使用singleton类
		System.out.println(Singleton1.INSTANCE);
		System.out.println(Singleton2.getInstance());
	}
}

class Singleton1 {

	// 声明一个公有静态成员
	public static final Singleton1 INSTANCE = new Singleton1();

	/**
	 * 私有的构造函数，保证了Singleton1实例的全局唯一性，只有一个实例(INSTANCE)存在
	 */
	private Singleton1() {
		// do something
	}
}

class Singleton2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2892082535158192922L;
	
	// 声明一个私有静态成员
	private static final Singleton2 INSTANCE = new Singleton2();

	/**
	 * 私有的构造函数，保证了Singleton2实例的全局唯一性，只有一个实例(INSTANCE)存在
	 */
	private Singleton2() {
		// do something
	}

	/**
	 * 通过静态方法返回同一个Singleton2实例
	 */
	public static Singleton2 getInstance() {
		return INSTANCE;
	}
	
	/**
	 * 如果singleton类是可序列化的，要小心反序列化的时候
	 * 为了避免通过反序列化的方式创建新的实例，要实现本方法
	 */
	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;// 返回真正的singleton实例，而不是反序列化回来的实例
	}
}
