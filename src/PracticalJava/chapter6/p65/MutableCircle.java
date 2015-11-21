/**
 * 
 */
package chapter6.p65;

/**
 * 可变的Circle类
 * <p>
 * e1/e2/e3这三个包以三种不同的方式来实现不可变的Circle类。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public class MutableCircle {

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
