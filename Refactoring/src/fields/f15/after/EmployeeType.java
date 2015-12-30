/**
 * 
 */
package fields.f15.after;

/**
 * 雇员类型(state object)
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public abstract class EmployeeType {

	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	/**
	 * 根据类型编号创建一个新类型
	 */
	public static EmployeeType newType(int code) {
		switch (code) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new RuntimeException("非法用户");
		}
	}

	/**
	 * 返回雇员类型
	 */
	public abstract int getTypeCode();
}
