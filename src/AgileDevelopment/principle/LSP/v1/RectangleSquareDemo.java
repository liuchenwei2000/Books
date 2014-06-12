/**
 * 
 */
package principle.LSP.v1;

/**
 * ������������ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-29
 */
public class RectangleSquareDemo {
}

/**
 * ������
 */
class Rectangle {
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}

/**
 * ��������
 * <p>
 * һ�������Ͻ���һ�������ξ���һ��(is-a)����
 * ��˽�Square��ΪRectangle�������ǺϺ��߼���
 * <p>
 * ���ǻ�������µ��������⣺
 * 1�������β�ͬʱ��Ҫwidth��height��ֻ��Ҫһ���͹���
 * �����Ȼ�޹ؽ�Ҫ�����������Ҫ������ǧ��Square����ʱ���ͻ���ɾ޴���ڴ��˷�
 * 2�������εı߳�����ȵģ�������widthʱ��heightҲҪ��֮�ı䣬��֮��Ȼ
 * ����ͨ����д�����е�setWidth()��setHeight()�������ﵽĿ��
 * <p>
 * ʵ���ϣ����̳���һ�������������дһ������ľ��巽��ʱ������ζ���������ȱ�ݵ�
 */
class Square extends Rectangle {

	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}

/**
 * �����
 */
class Area {

	/**
	 * ��Ȼ����ľ��������ε�����ƺ��������ݵġ���ȷ��
	 * ��һ�������ݵ����δ�ؾͺ����е��û��������ݣ��籾������
	 * <p>
	 * �������ı���˵��һЩʹ��Rectangle����ķ���������ȷ�Ĳ���Square����
	 * ������Щ�������ԣ�Square�����滻Rectangle�����Square��Rectangle֮��Ĺ�ϵ��Υ��LSP��
	 */
	public static void test(Rectangle r) {
		r.setWidth(5);
		r.setHeight(4);
		// ������Զ���Rectangle����ȷ�ģ����Ƕ���Square�Ͳ�����
		assert (20 == r.getWidth() * r.getHeight());
	}
}