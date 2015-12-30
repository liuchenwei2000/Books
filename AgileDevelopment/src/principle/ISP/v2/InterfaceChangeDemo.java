/**
 * 
 */
package principle.ISP.v2;

/**
 * 接口改变演示类
 * <p>
 * 在维护面向对象的应用程序时，常常会改变现有类和组件的接口。
 * 通常这些改变都会造成巨大的影响，并且迫使系统的绝大部分需要重新编译和部署。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-11-1
 */
public class InterfaceChangeDemo {
}

/**
 * 客户端程序
 */
class Client {

	/**
	 * 操作OriginalInterface的方法
	 */
	public void operation(OriginalInterface oi) {
		oi.operation1();
		oi.operation2();
	}
}

/**
 * 原始接口
 * <p>
 * 接口改变了，新加了一个方法，这就导致所有的实现类都要重新编译
 */
interface OriginalInterface {

	public void operation1();
	
	public void operation2();
}

class Class1 implements OriginalInterface {

	public void operation1() {
	}

	public void operation2() {
	}
}

class Class2 implements OriginalInterface {

	public void operation1() {
	}

	public void operation2() {
	}
}
