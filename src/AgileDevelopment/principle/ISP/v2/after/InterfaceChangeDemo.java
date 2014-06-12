/**
 * 
 */
package principle.ISP.v2.after;

/**
 * 接口改变演示类
 * <p>
 * 在维护面向对象的应用程序时，常常会改变现有类和组件的接口。
 * 通常这些改变都会造成巨大的影响，并且迫使系统的绝大部分需要重新编译和部署。
 * 这种影响可以通过为现有的对象增加新接口的方法来缓解，而不是去改变现有的接口。
 * 原有接口的客户如果想访问新接口中的方法，可以通过对象去访问该接口。
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
		// 如果想访问新接口中的方法，可以通过这种方式
		if (oi instanceof NewInterface) {
			((NewInterface) oi).operation2();
		}
	}
}

/**
 * 原始接口
 * <p>
 * 原始接口不变，以便于客户端无需改动和重新编译。
 */
interface OriginalInterface {

	public void operation1();
}

/**
 * 新接口
 */
interface NewInterface {

	public void operation2();
}

class Class1 implements OriginalInterface {

	public void operation1() {
	}
}

class Class2 implements OriginalInterface, NewInterface {

	public void operation1() {
	}

	public void operation2() {
	}
}