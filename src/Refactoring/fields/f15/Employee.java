/**
 * 
 */
package fields.f15;

/**
 * 雇员类(旧)
 * 
 * 工程师或售货员可以被提拔为经理
 * 这样对象的type在对象生命期内是可变的
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Employee {

	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	private int type;// 雇员类型

	public Employee(int type) {
		this.type = type;
	}

	/**
	 * 根据雇员类型返回相应工资
	 */
	public int getPayment() {
		switch (type) {
		case ENGINEER:
			return 1500;
		case SALESMAN:
			return 1000;
		case MANAGER:
			return 2000;
		default:
			throw new RuntimeException("非法用户");
		}
	}
}