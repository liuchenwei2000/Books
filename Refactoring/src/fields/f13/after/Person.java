/**
 * 
 */
package fields.f13.after;

/**
 * 人类(新)
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-26
 */
public class Person {

	private BloodGroup bloodGroup;// 血型

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
	 * 返回血型编码
	 */
	public int getBloodGroupCode() {
		return bloodGroup.getCode();
	}
	
	public static void main(String[] args) {
		// 这样就能够进行类型检查保证参数的合法性
		Person p1 = new Person(BloodGroup.A);
		p1.getBloodGroup();
		p1.getBloodGroupCode();
		p1.setBloodGroup(BloodGroup.B);
	}
}
