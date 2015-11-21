/**
 * 
 */
package chapter6.p65.e1;

/**
 * 实现了ImmutableCircle接口的可变Circle类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public class MutableCircle implements ImmutableCircle {

	private double redius;// 半径

	public MutableCircle(double redius) {
		this.redius = redius;
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
}
