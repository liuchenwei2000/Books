/**
 * 
 */
package chapter2.item6;

/**
 * 终结函数链演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-12-25
 */
public class FinalizerChainingDemo {
}

class BaseClass {

	protected void finalize() throws Throwable {
		// do something
	}
}

class SubClass extends BaseClass {

	/**
	 * 子类的终结函数
	 */
	protected void finalize() throws Throwable {
		/*
		 * 应该在一个try块中终结子类，并且在对应的finally块中调用超类的终结函数。 
		 * 这样能保证即使子类的终结过程抛出了异常，超类的终结函数也会被执行，反之亦然。
		 */
		try {
			// do something
		} finally {
			super.finalize();
		}
	}
}