/**
 * 
 */
package principle.OCP.v1;

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
	 * 这个方法不符合OCP，因为它对于新形状的添加不是封闭的
	 * 如果增加一个三角形(任何一种新类型)，就必须修改这个方法了
	 * <p>
	 * 另外这个方法中的switch语句会在应用程序中不断地重复出现
	 * 每个方法中的switch语句负责完成的工作差别甚微，比如有的负责移动形状，有的负责删除形状
	 * 以后每加一种新的形状，就意味着要修改所有的这种switch语句，并在每一处都添加对新增形状类型的判断
	 * <p>
	 * 在进行上述改动时，还需要在ShapeType中添加新的形状类型枚举
	 * 由于所有不同的形状都依赖于这个枚举，所以必须重新编译所有依赖于此枚举的模块
	 * <p>
	 * 由此可见，给应用程序增加一种新的形状类型这样一个简单的行为，就导致
	 * 随后对于许多模块的源代码、甚至许多模块的二进制文件的连锁改动，影响巨大
	 */
	public void drawAll(Shape[] shapes) {
		for (Shape shape : shapes) {
			switch (shape.getType()) {
			case CIRCLE:
				drawCircle();
				break;
			case SQUARE:
				drawSquare();
				break;
			}
		}
	}

	private void drawCircle() {
		System.out.println("draw a circle.");
	}

	private void drawSquare() {
		System.out.println("draw a square.");
	}
}

enum ShapeType {

	CIRCLE, SQUARE
}

abstract class Shape {

	public abstract ShapeType getType();
}

class Circle extends Shape {

	public ShapeType getType() {
		return ShapeType.CIRCLE;
	}
}

class Square extends Shape {

	public ShapeType getType() {
		return ShapeType.SQUARE;
	}
}
