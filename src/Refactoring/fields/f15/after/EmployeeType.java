/**
 * 
 */
package fields.f15.after;

/**
 * ��Ա����(state object)
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
 */
public abstract class EmployeeType {

	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	/**
	 * �������ͱ�Ŵ���һ��������
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
			throw new RuntimeException("�Ƿ��û�");
		}
	}

	/**
	 * ���ع�Ա����
	 */
	public abstract int getTypeCode();
}