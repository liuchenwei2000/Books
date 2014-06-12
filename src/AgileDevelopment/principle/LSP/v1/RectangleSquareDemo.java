/**
 * 
 */
package principle.LSP.v1;

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
 * 正方形类
 * <p>
 * 一般意义上讲，一个正方形就是一个(is-a)矩形
 * 因此将Square视为Rectangle的子类是合乎逻辑的
 * <p>
 * 但是会带来如下的两个问题：
 * 1，正方形不同时需要width和height，只需要一个就够了
 * 这点虽然无关紧要，但如果必须要创建上千个Square对象时，就会造成巨大的内存浪费
 * 2，正方形的边长是相等的，当设置width时，height也要随之改变，反之亦然
 * 我们通过重写矩形中的setWidth()和setHeight()方法来达到目的
 * <p>
 * 实际上，当继承自一个具体类或者重写一个基类的具体方法时，都意味着设计是有缺陷的
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
 * 面积类
 */
class Area {

	/**
	 * 虽然上面的矩形正方形的设计似乎是自相容的、正确的
	 * 但一个自相容的设计未必就和所有的用户程序相容，如本方法。
	 * <p>
	 * 本方法的表现说明一些使用Rectangle对象的方法不能正确的操作Square对象
	 * 对于这些方法而言，Square不能替换Rectangle，因此Square和Rectangle之间的关系是违反LSP的
	 */
	public static void test(Rectangle r) {
		r.setWidth(5);
		r.setHeight(4);
		// 这个断言对于Rectangle是正确的，但是对于Square就不对了
		assert (20 == r.getWidth() * r.getHeight());
	}
}