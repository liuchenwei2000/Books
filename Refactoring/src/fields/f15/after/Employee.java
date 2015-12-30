/**
 * 
 */
package fields.f15.after;

/**
 * 雇员类(新)
 * 
 * 工程师或售货员可以被提拔为经理
 * 这样对象的type在对象生命期内是可变的
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Employee {

	private EmployeeType type;// 雇员类型

	public Employee(int type) {
		this.type = EmployeeType.newType(type);
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type.getTypeCode();
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = EmployeeType.newType(type);
	}

	/**
	 * 根据雇员类型返回相应工资
	 */
	public int getPayment() {
		switch (getType()) {
		case EmployeeType.ENGINEER:
			return 1500;
		case EmployeeType.SALESMAN:
			return 1000;
		case EmployeeType.MANAGER:
			return 2000;
		default:
			throw new RuntimeException("非法用户");
		}
	}
}
