/**
 * 
 */
package chapter6.p65.e3;

import chapter6.p65.MutableCircle;

/**
 * 不可变Circle类
 * <p>
 * 这就是所谓的 不可变的委托类。
 * 本类只包含immutable函数，并将外界对它们的调用任务委托给内含的mutable object。
 * <p>
 * 当无法修改既有之mutable class源码时，这个办法尤其有用。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public final class ImmutableCircle {

	private MutableCircle circle;// 内含的mutable object

	/**
	 * 当创建一个ImmutableCircle对象时，也创建了一个MutableCircle对象，不过
	 * 前者的用户不得访问后者（因为后者是private），只能访问由ImmutableCircle提供的immutable方法。
	 */
	public ImmutableCircle(double redius) {
		this.circle = new MutableCircle(redius);
	}

	public double getRedius() {
		return circle.getRedius();
	}
}