/**
 * 
 */
package principle.OCP.v3;

/**
 * 形状绘制器
 * <p>
 * 新需求：绘制器可以按照指定顺序绘制形状
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-28
 */
public class ShapeDrawer {

	private SortStrategy sortStrategy;
	
	/**
	 * 按顺序绘制所有的形状
	 */
	public void drawAll(Shape[] shapes) {
		if (sortStrategy != null) {
			sortStrategy.sort(shapes);
		}
		for (Shape shape : shapes) {
			shape.draw();
		}
	}

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
}

/**
 * 排序策略
 * <p>
 * 将绘制顺序这类变化进行隔离，封装到一个接口中
 */
interface SortStrategy {
	
	/**
	 * 对形状数组进行重新排序
	 */
	public void sort(Shape[] shapes);
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