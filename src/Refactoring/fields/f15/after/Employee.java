/**
 * 
 */
package fields.f15.after;

/**
 * ��Ա��(��)
 * 
 * ����ʦ���ۻ�Ա���Ա����Ϊ����
 * ���������type�ڶ������������ǿɱ��
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
 */
public class Employee {

	private EmployeeType type;// ��Ա����

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
	 * ���ݹ�Ա���ͷ�����Ӧ����
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
			throw new RuntimeException("�Ƿ��û�");
		}
	}
}