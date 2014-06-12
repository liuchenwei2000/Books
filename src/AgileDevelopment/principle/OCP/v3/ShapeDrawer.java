/**
 * 
 */
package principle.OCP.v3;

/**
 * ��״������
 * <p>
 * �����󣺻��������԰���ָ��˳�������״
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-28
 */
public class ShapeDrawer {

	private SortStrategy sortStrategy;
	
	/**
	 * ��˳��������е���״
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
 * �������
 * <p>
 * ������˳������仯���и��룬��װ��һ���ӿ���
 */
interface SortStrategy {
	
	/**
	 * ����״���������������
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