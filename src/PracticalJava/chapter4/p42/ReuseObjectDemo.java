/**
 * 
 */
package chapter4.p42;

/**
 * ���ö���ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-6
 */
public class ReuseObjectDemo {
	
	/**
	 * ����������������Ǽ������й�Ա��нˮ�ܶ�
	 */
	
	/**
	 * �����������Ĵ����˶�������˲���Ҫ�����ܿ�����
	 */
	public static int totalSalary(int[] ids, String[] names) {
		int total = 0;
		for (int i = 0; i < ids.length; i++) {
			// ��������Employee����
			Employee employee = new Employee(ids[i], names[i]);
			total += employee.salary();
		}
		return total;
	}
	
	/**
	 * ������������ͬһ��������������ܡ�
	 */
	public static int totalSalary2(int[] ids, String[] names) {
		Employee employee = new Employee();
		int total = 0;
		for (int i = 0; i < ids.length; i++) {
			// Ϊ��ʹ���ü����������ã�Employee������ṩһЩ�������������ö���ĸ���ֵ��
			employee.setId(ids[i]);
			employee.setName(names[i]);
			total += employee.salary();
		}
		return total;
	}
	
	/**
	 * ���Employee��û���ṩsetter�����������ֿ��ԽӴ�Դ�룬����ʹ��һ�ָ���Ч�ļ�����
	 * ���ٵ��ö�����������ö���ĸ�ֵ�򣬶����ṩһ�����³�ʼ����������һ�ε��ô����ε��á�
	 */
	public static int totalSalary3(int[] ids, String[] names) {
		Employee employee = new Employee();
		int total = 0;
		for (int i = 0; i < ids.length; i++) {
			// �������³�ʼ������
			employee.reinitialize(ids[i], names[i]);
			total += employee.salary();
		}
		return total;
	}
}

/**
 * ��Ա��
 */
class Employee {
	
	private int id;// Ա�����
	private String name;
	
	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * ��Աнˮ
	 */
	public int salary(){
		// ��ѯ���ݿ����
		return 100;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ʹ�ò������³�ʼ������
	 */
	public void reinitialize(int id, String name) {
		this.id = id;
		this.name = name;
	}
}