/**
 * 
 */
package chapter6.p65.e3;

import chapter6.p65.MutableCircle;

/**
 * ���ɱ�Circle��
 * <p>
 * �������ν�� ���ɱ��ί���ࡣ
 * ����ֻ����immutable�����������������ǵĵ�������ί�и��ں���mutable object��
 * <p>
 * ���޷��޸ļ���֮mutable classԴ��ʱ������취�������á�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-18
 */
public final class ImmutableCircle {

	private MutableCircle circle;// �ں���mutable object

	/**
	 * ������һ��ImmutableCircle����ʱ��Ҳ������һ��MutableCircle���󣬲���
	 * ǰ�ߵ��û����÷��ʺ��ߣ���Ϊ������private����ֻ�ܷ�����ImmutableCircle�ṩ��immutable������
	 */
	public ImmutableCircle(double redius) {
		this.circle = new MutableCircle(redius);
	}

	public double getRedius() {
		return circle.getRedius();
	}
}