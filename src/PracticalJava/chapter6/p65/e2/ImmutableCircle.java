/**
 * 
 */
package chapter6.p65.e2;

/**
 * 不可变Circle类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public final class ImmutableCircle implements Circle {

	private double redius;// 半径

	public ImmutableCircle(double redius) {
		this.redius = redius;
	}

	public double getRedius() {
		return redius;
	}
}
