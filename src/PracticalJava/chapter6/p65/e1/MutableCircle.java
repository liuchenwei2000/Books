/**
 * 
 */
package chapter6.p65.e1;

/**
 * ʵ����ImmutableCircle�ӿڵĿɱ�Circle��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-18
 */
public class MutableCircle implements ImmutableCircle {

	private double redius;// �뾶

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