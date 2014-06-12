/**
 * 
 */
package fields.f15;

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

	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	private int type;// ��Ա����

	public Employee(int type) {
		this.type = type;
	}

	/**
	 * ���ݹ�Ա���ͷ�����Ӧ����
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
			throw new RuntimeException("�Ƿ��û�");
		}
	}
}