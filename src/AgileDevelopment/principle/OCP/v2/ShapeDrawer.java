/**
 * 
 */
package principle.OCP.v2;

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
	 * ��������Ƿ���OCP�ģ������Ҫ��չ����������Ϊ��ʹ֮�ܹ�����һ���µ���״
	 * ֻ��Ҫ���һ���µ�Shape��������༴�ɣ������������κθı�
	 * ��Ȼ���������һ�������α���Ҫ�Ķ�ϵͳ�е�ĳЩ���֣����������������Ҫ�Ķ�
	 * ��������������ѭOCP�ĳ��������������Ķ�������Ҫ�ĸĶ�������
	 * �����µ�ģ�飬�Լ�Ϊ���ܹ�ʵ���������͵Ķ��������Χ��main�ĸĶ�
	 * <p>
	 * ������Ҳ����ҪΪ���ҳ���Ҫ�޸ĵĵط�����ϵͳ�����еط���Ѱ(���ٴ���)
	 * <p>
	 * ������һ������״ʱ������ģ�������Դ�붼����Ҫ�Ķ���Ҳ����Ҫ���±���
	 * ֻ��һ�����⣬�Ǿ���ʵ�ʴ���Shape�����������ʵ����ģ�����Ķ�
	 * ͨ������Shape���µ�������Ĺ���Ҫô��main�С�Ҫô��main���õ�һЩ���������(���ٽ���)
	 * <p>
	 * �κ�Ӧ�ó���������drawAllʱ���������ٸ�����Circle��Square(�����ι�)
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