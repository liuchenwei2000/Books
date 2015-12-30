/**
 * 
 */
package chapter2.item3;

/**
 * 不可实例化的工具类演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-12-18
 */
public class UtilityDemo {
}

/**
 * 不可实例化的工具类
 */
class Utility {

	/**
	 * 显式构造函数是私有的，所以在该类的外部是不能调用的
	 * 如果该构造函数不会被类自身从内部调用，就能保证该类永远不会被实例化。
	 * 这种做法有些违反直觉，可以在代码中对构造函数的作用增加一些注释
	 */
	private Utility() {
		// do nothing and no instance
	}
}
