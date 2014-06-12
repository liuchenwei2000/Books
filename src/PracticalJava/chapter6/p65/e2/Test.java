/**
 * 
 */
package chapter6.p65.e2;

/**
 * 客户端测试类 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MutableCircle mc = new MutableCircle(5);
		useMutable(mc);
		
		ImmutableCircle ic = new ImmutableCircle(5);
		useImmutable(ic);
		// 此时转型(cast)就无法打破可变性了，下面的语句会有编译错
		// useMutable((MutableCircle) ic);
		
		useCircle(mc);
		useCircle(ic);
	}

	/**
	 * 需要可变对象的函数
	 */
	public static void useMutable(MutableCircle mc) {
	}

	/**
	 * 需要不可变对象的函数
	 */
	public static void useImmutable(ImmutableCircle mc) {
	}

	/**
	 * 不在乎对象可变性的函数
	 */
	public static void useCircle(Circle c) {
	}
}