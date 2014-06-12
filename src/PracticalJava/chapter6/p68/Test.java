/**
 * 
 */
package chapter6.p68;

/**
 * 在构造函数中调用non-final函数造成的错误
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
		Derived derived = new Derived();
		// 下面会输出：value = 0
		System.out.println("value = " + derived.getValue());
		/*
		 * 详解：
		 * 当创建Derived对象的时候，会首先自动调用Base的构造函数，于是lookup()函数就被调用了。
		 * 当执行权进入Derived的lookup时(多态)，Derived对象的实例变量初始化尚未进行，所有的实例变量都是默认值。
		 * 所以当时Derived.number的值为0，于是0就被传给了Base.value。
		 * 
		 * 当构造函数调用non-final函数时，就有可能发生这种错误。
		 * 如果该函数被一个派生类覆盖，而且该函数返回一个在实例变量初始化期间才被初始化的值，就会产生错误。
		 */
	}
}

class Base {

	private int value;

	public Base() {
		this.value = lookup();
	}

	/**
	 * 这是一个public的非final函数，并且会被构造函数调用。
	 */
	public int lookup() {
		// 比如查询数据库
		int v = lookupDB();
		return v;
	}

	private int lookupDB() {
		return 5;
	}

	public int getValue() {
		return value;
	}
}

class Derived extends Base {

	private int number = 10;

	/**
	 * 派生类重写了lookup函数
	 */
	public int lookup() {
		return number;
	}
}