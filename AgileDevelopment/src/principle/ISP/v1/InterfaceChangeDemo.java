/**
 * 
 */
package principle.ISP.v1;

/**
 * 接口改变演示类
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
	}
}

/**
 * 原始接口
 */
interface OriginalInterface {

	public void operation1();
}

class Class1 implements OriginalInterface {

	public void operation1() {
	}
}

class Class2 implements OriginalInterface {

	public void operation1() {
	}
}
