/**
 * 
 */
package fields.f13;

/**
 * ����(��)
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-26
 */
public class Person {

	/** ����Ѫ�ͳ��� */
	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;

	private int bloodGroup;// Ѫ��

	public Person(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the bloodGroup
	 */
	public int getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 *            the bloodGroup to set
	 */
	public void setBloodGroup(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person(Person.A);
		p1.getBloodGroup();
		// ����ʹ����Ȼ�߼��Ǵ���ĵ��Ǳ������������
		p1.setBloodGroup(6);
		// ����ʹ����Ȼ�߼��Ǵ���ĵ��Ǳ������������
		Person p2 = new Person(5);
		p2.getBloodGroup();
	}
}