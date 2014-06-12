/**
 * 
 */
package chapter4.p43;

/**
 * ������ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-6
 */
public class LazyEvaluationDemo {
}

/**
 * ��ԭʼ�汾�Ĺ�Ա��
 */
class Employee {
	
	private int id;
	private String name;
	private String address;
	private int salary;
	
	public Employee(int id) {
		this.id = id;
		// �����ʼ����ʱ�򣬶����е�ֵ�򶼽�������ֵ��
		// 1�����󴴽��ٶ�����2����Щֵ���Ժ�δ��ȫ���õ��ϡ�
		this.name = queryNameFromDB(id);
		this.address = queryAddressFromDB(id);
		this.salary = querySalaryFromDB(id);
	}

	private String queryNameFromDB(int id) {
		return "";
	}

	private String queryAddressFromDB(int id) {
		return "";
	}

	private int querySalaryFromDB(int id) {
		return 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}
}

/**
 * �����������ؼ����Ĺ�Ա��
 */
class LazyEmployee {
	
	private int id;
	private String name;
	private String address;
	private int salary;
	
	public LazyEmployee(int id) {
		this.id = id;
		// �����ʼ����ʱ�򣬲��ٶ����е�ֵ�򶼽�������ֵ��
	}

	private String queryNameFromDB(int id) {
		return "";
	}

	private String queryAddressFromDB(int id) {
		return "";
	}

	private int querySalaryFromDB(int id) {
		return 0;
	}

	public int getId() {
		return id;
	}

	/**
	 * ������������ʾ��ֻ�еȵ�������Ҫ��ʱ���ȥ��ֵ�� 
	 */
	
	public String getName() {
		if (name == null) {
			this.name = queryNameFromDB(id);
		}
		return name;
	}

	public String getAddress() {
		if (address == null) {
			this.address = queryAddressFromDB(id);
		}
		return address;
	}

	public int getSalary() {
		if (salary == 0) {
			this.salary = querySalaryFromDB(id);
		}
		return salary;
	}
}