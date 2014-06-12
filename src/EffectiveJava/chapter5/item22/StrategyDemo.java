/**
 * 
 */
package chapter5.item22;

import java.io.Serializable;

/**
 * 策略模式实现演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2011-3-13
 */
public class StrategyDemo {
}

/**
 * 比较器接口(策略接口)
 */
interface Comparator {

	public int compare(Object o1, Object o2);
}

/**
 * 字符串长度比较器的第一种实现
 */
class StringLengthComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((String) o1).length() - ((String) o2).length();
	}
}

/**
 * 字符串长度比较器的第二种实现
 * <p>
 * 作为一个典型的具体策略类，StringLengthComparator是无状态的：
 * 它没有域，所以这个类的所有实例在功能上都是相互等价的。
 * 因此，它作为一个单例(singleton)是非常合适的，从而节省不必要的对象创建开销。
 */
class StringLengthComparator2 implements Comparator {

	/** 单例 */
	public static final StringLengthComparator2 INSTANCE = new StringLengthComparator2();

	private StringLengthComparator2() {
	}

	@Override
	public int compare(Object o1, Object o2) {
		return ((String) o1).length() - ((String) o2).length();
	}
}

/**
 * 字符串长度比较器的第三种实现
 * <p>
 * 因为策略接口被用做所有具体策略实例的类型，所以并不需要为了导出一个具体策略类而把具体策略类做成公有的。
 * 相反，宿主类可以导出一个公有的静态域或者静态工厂方法，其类型为策略接口，并且具体策略类可以是宿主类的一个私有嵌套类。
 * <p>
 * String类使用了这种模式，通过它的String.CASE_INSENSITIVE_ORDER域导出一个大小写不敏感的比较器。
 */
class Host {

	/** 单例 */
	public static final Comparator STRING_LENGTH_COMPARATOR = new StringLengthComparator3();

	/**
	 * 私有嵌套类
	 * <p>
	 * 这里使用的是静态成员类，而不是匿名类，以便允许该具体策略类可以实现第二个接口。
	 */
	private static class StringLengthComparator3 implements Comparator, Serializable  {

		private static final long serialVersionUID = 1L;

		@Override
		public int compare(Object o1, Object o2) {
			return ((String) o1).length() - ((String) o2).length();
		}
	}
}