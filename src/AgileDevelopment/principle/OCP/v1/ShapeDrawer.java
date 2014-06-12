/**
 * 
 */
package principle.OCP.v1;

/**
 * ��״������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-28
 */
public class ShapeDrawer {

	/**
	 * ��˳��������е���״
	 * <p>
	 * �������������OCP����Ϊ����������״����Ӳ��Ƿ�յ�
	 * �������һ��������(�κ�һ��������)���ͱ����޸����������
	 * <p>
	 * ������������е�switch������Ӧ�ó����в��ϵ��ظ�����
	 * ÿ�������е�switch��为����ɵĹ��������΢�������еĸ����ƶ���״���еĸ���ɾ����״
	 * �Ժ�ÿ��һ���µ���״������ζ��Ҫ�޸����е�����switch��䣬����ÿһ������Ӷ�������״���͵��ж�
	 * <p>
	 * �ڽ��������Ķ�ʱ������Ҫ��ShapeType������µ���״����ö��
	 * �������в�ͬ����״�����������ö�٣����Ա������±������������ڴ�ö�ٵ�ģ��
	 * <p>
	 * �ɴ˿ɼ�����Ӧ�ó�������һ���µ���״��������һ���򵥵���Ϊ���͵���
	 * ���������ģ���Դ���롢�������ģ��Ķ������ļ��������Ķ���Ӱ��޴�
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