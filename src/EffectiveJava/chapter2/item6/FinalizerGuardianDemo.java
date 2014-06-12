/**
 * 
 */
package chapter2.item6;

/**
 * 终结函数守卫者(Finalizer Guardian)演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-12-25
 */
public class FinalizerGuardianDemo {
}

/**
 * 如果一个子类改写了超类的终结函数，但是忘了手工调用超类的终结函数
 * (或者有意不调用)，那么超类的终结函数将永远也不会被调用到。
 */
@SuppressWarnings("unused")
class King {
	
	/**
	 * 要防范这样的情况，只要为每一个将被终结的对象创建一个附加的对象。
	 * 不是把终结函数放在要求终结处理的类中，而是把终结函数放在一个匿名的类中，该匿名类的唯一用途就是终结其外围实例。
	 * 该匿名类的单个实例被称为终结函数守卫者，外围类的每一个实例都会创建这样一个守卫者。
	 * 外围实例在它的私有实例域中保存着一个对其守卫者的唯一引用，所以，终结函数守卫者与外围实例可以同时启动终结过程。
	 * 当守卫者被终结的时候，它执行外围实例所期望的终结行为，就好像它的终结函数是外围对象上的一个方法一样。
	 */
	private final Object finalizerGuardian = new Object(){

		@Override
		protected void finalize() throws Throwable {
			// 终结外部的King对象
		}
	};
	
	// 本类并没用终结函数finalize，除了从Object中自动继承的那个无关紧要的之外，
	// 所以子类的终结函数是否调用super.finalize并不重要。
	// 对于每一个带有终结函数的非final公有类，都应该考虑使用这些技术。
}