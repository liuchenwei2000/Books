/**
 * 
 */
package fields.f13.after;

/**
 * ����(��)
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-26
 */
public class Person {

	private BloodGroup bloodGroup;// Ѫ��

	public Person(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the bloodGroup
	 */
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 *            the bloodGroup to set
	 */
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * ����Ѫ�ͱ���
	 */
	public int getBloodGroupCode() {
		return bloodGroup.getCode();
	}
	
	public static void main(String[] args) {
		// �������ܹ��������ͼ�鱣֤�����ĺϷ���
		Person p1 = new Person(BloodGroup.A);
		p1.getBloodGroup();
		p1.getBloodGroupCode();
		p1.setBloodGroup(BloodGroup.B);
	}
}
