/**
 * 
 */
package fields.f13;

/**
 * 人类(旧)
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-26
 */
public class Person {

	/** 四种血型常量 */
	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;

	private int bloodGroup;// 血型

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
		// 这样使用虽然逻辑是错误的但是编译器并不检查
		p1.setBloodGroup(6);
		// 这样使用虽然逻辑是错误的但是编译器并不检查
		Person p2 = new Person(5);
		p2.getBloodGroup();
	}
}