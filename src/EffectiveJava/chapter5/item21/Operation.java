/**
 * 
 */
package chapter5.item21;

/**
 * 运算操作枚举
 * <p>
 * 如果一个类型安全枚举类有一些方法，对于不同的常量其行为有很大的变化，
 * 那么应该为每一个常量用一个单独的私有类或者匿名的内部类。
 * 这使得每个常量对于每个这样的方法都有自己的实现，而且也可以自动调用正确的方法实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2011-3-14
 */
public abstract class Operation {

	private final String name;

	Operation(String name) {
		this.name = name;
	}

	/**
	 * 返回运算结果
	 */
	abstract double eval(double x, double y);

	public String toString() {
		return name;
	}

	/**
	 * 加法
	 */
	public static final Operation PLUS = new Operation("+") {

		@Override
		double eval(double x, double y) {
			return x + y;
		}
	};

	/**
	 * 减法
	 */
	public static final Operation MINUS = new Operation("-") {

		@Override
		double eval(double x, double y) {
			return x - y;
		}
	};

	/**
	 * 乘法
	 */
	public static final Operation TIMES = new Operation("*") {

		@Override
		double eval(double x, double y) {
			return x * y;
		}
	};

	/**
	 * 除法
	 */
	public static final Operation DIVIDE = new Operation("/") {

		@Override
		double eval(double x, double y) {
			return x / y;
		}
	};
}