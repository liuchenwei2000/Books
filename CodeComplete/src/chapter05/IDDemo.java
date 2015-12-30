/**
 * 
 */
package chapter05;

/**
 * ID演示类
 * <p>
 * 信息隐藏的一个例子
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-11-7
 */
public class IDDemo {
}

/**
 * 最开始使用int来表示id，id是递增的
 * 获取一个新ID的方法就是++id，系统中到处充斥着这种语句来获取新ID
 * 一旦获取新ID的算法有变化，那就需要修改所有的这些语句
 * 比如8不可以作为id，预留一些其他数字不可作为id
 */
class Demo1 {

	private static int id = 0;

	public void method1() {
		// some codes
		++id;
		// some codes
	}

	public void method2() {
		// some codes
		++id;
		// some codes
	}
}

/**
 * 创建新ID的算法就是一种应该隐藏起来的设计决策
 * 通过创建一个方法getNewID()来封装创建新ID的算法
 * 这样如果算法有变化而引起改动，也不会影响到程序的其他部分
 * 可是又发现需要把ID的类型由整数改为字符串，而getNewID()的返回类型就是int
 * 这时需要深入程序内部，把调用getNewID()的地方都要修改一遍
 */
class Demo2 {

	// 
	private static int id = 0;

	public void method1() {
		// some codes
		getNewID();
		// some codes
	}

	public void method2() {
		// some codes
		getNewID();
		// some codes
	}

	private int getNewID() {
		if (++id == 8) {
			return getNewID();
		}
		return ++id;
	}
}

/**
 * ID的类型同样也是一个需要隐藏的秘密
 * 对外界透露ID是个整数实际上是鼓励他们对ID使用整数操作
 * 可以创建一个简单的ID类来隐藏ID的类型，并且提供可以将ID解释成int和String的方法
 */
class Demo3 {

	private static int id = 0;

	public void method1() {
		// some codes
		getNewID().toInt();
		// some codes
	}

	public void method2() {
		// some codes
		getNewID().toStr();
		// some codes
	}

	private ID getNewID() {
		return new ID(getNewIDPrivate());
	}

	private int getNewIDPrivate() {
		if (++id == 8) {
			return getNewIDPrivate();
		}
		return ++id;
	}

	static class ID {

		private int id;

		public ID(int id) {
			this.id = id;
		}

		public int toInt() {
			return id;
		}

		public String toStr() {
			return String.valueOf(id);
		}
	}
}
