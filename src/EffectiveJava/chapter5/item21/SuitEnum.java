/**
 * 
 */
package chapter5.item21;

/**
 * �˿��ƻ�ɫö��
 * <p>
 * ʹ��Javaԭ��enum����ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-3-14
 */
public enum SuitEnum {
	
	CLUBS("clubs"), DIAMONDS("diamonds"), HEARTS("hearts"), SPADES("spades");

	private final String name;

	private SuitEnum(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}