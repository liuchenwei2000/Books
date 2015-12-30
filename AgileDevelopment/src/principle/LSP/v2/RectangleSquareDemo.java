/**
 * 
 */
package principle.LSP.v2;

/**
 * 矩形正方形演示类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-29
 */
public class RectangleSquareDemo {
}

/**
 * 矩形类
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
 * 正方形类，不再继承Rectangle
 */
class Square {

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}

/**
 * 面积类
 */
class Area {

	public static void testArea(Rectangle r) {
		r.setWidth(5);
		r.setHeight(4);
		assert (20 == r.getWidth() * r.getHeight());
	}

	public static void testArea(Square s) {
		s.setLength(5);
		assert (25 == s.getLength() * s.getLength());
	}
}
