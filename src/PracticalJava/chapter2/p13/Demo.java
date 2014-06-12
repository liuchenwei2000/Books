/**
 * 
 */
package chapter2.p13;

/**
 * 示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-22
 */
public class Demo {
}

/**
 * 实现了equals()的基类
 */
class Base {
	
	private int value;

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && getClass() == obj.getClass()) {
			Base other = (Base) obj;
			return value == other.value;
		}
		return false;
	}
}

/**
 * 传统方式实现equals()的派生类
 */
class Derived1 extends Base {
	
	private int number;
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
			Derived1 other = (Derived1) obj;
			return number == other.number;
		}
		return false;
	}
}

/**
 * 简化方式实现equals()的派生类
 * <p>
 * 如果采用这种简化方式，必须获得基类的源码，确保在那里做了适当检查工作。
 * 而且这种简化方式使你不得不承担某些风险————程序有可能因为未来classes继承体系被修改而受到损坏。
 * 所以，只有当删除那些检查代码将会带来充分的性能提升，而且绝对没有后续风险的情况下，才会使用这种实现方式。
 */
class Derived2 extends Base {
	
	private int number;
	
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			Derived2 other = (Derived2) obj;
			return number == other.number;
		}
		return false;
	}
}