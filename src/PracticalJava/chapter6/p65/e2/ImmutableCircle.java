/**
 * 
 */
package chapter6.p65.e2;

/**
 * ���ɱ�Circle��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-18
 */
public final class ImmutableCircle implements Circle {

	private double redius;// �뾶

	public ImmutableCircle(double redius) {
		this.redius = redius;
	}

	public double getRedius() {
		return redius;
	}
}