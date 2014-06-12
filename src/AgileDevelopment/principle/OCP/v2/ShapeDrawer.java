/**
 * 
 */
package principle.OCP.v2;

/**
 * 形状绘制器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-28
 */
public class ShapeDrawer {

	/**
	 * 按顺序绘制所有的形状
	 * <p>
	 * 这个方法是符合OCP的，如果想要扩展本方法的行为，使之能够绘制一种新的形状
	 * 只需要添加一个新的Shape类的派生类即可，方法本身不需任何改变
	 * 当然，如果增加一个三角形必须要改动系统中的某些部分，但是这个方法不需要改动
	 * 它不会引起像不遵循OCP的程序那样的连锁改动，所需要的改动仅仅是
	 * 增加新的模块，以及为了能够实例化新类型的对象而进行围绕main的改动
	 * <p>
	 * 并且再也不需要为了找出需要修改的地方而在系统的所有地方搜寻(不再脆弱)
	 * <p>
	 * 当增加一个新形状时，现有模块的所有源码都不需要改动，也不需要重新编译
	 * 只有一个例外，那就是实际创建Shape类的新派生类实例的模块必须改动
	 * 通常创建Shape类新的派生类的工作要么在main中、要么在main调用的一些函数中完成(不再僵化)
	 * <p>
	 * 任何应用程序中重用drawAll时，都无需再附带上Circle和Square(不再牢固)
	 */
	public void drawAll(Shape[] shapes) {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}

abstract class Shape {

	public abstract void draw();
}

class Circle extends Shape {

	public void draw() {
		System.out.println("draw a circle.");
	}
}

class Square extends Shape {

	public void draw() {
		System.out.println("draw a square.");
	}
}