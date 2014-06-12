/**
 * 
 */
package chapter4.p43;

/**
 * 懒加载示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-6
 */
public class LazyEvaluationDemo {
}

/**
 * 最原始版本的雇员类
 */
class Employee {
	
	private int id;
	private String name;
	private String address;
	private int salary;
	
	public Employee(int id) {
		this.id = id;
		// 对象初始化的时候，对所有的值域都进行了求值。
		// 1，对象创建速度慢。2，这些值域以后未必全都用的上。
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
 * 采用了懒加载技术的雇员类
 */
class LazyEmployee {
	
	private int id;
	private String name;
	private String address;
	private int salary;
	
	public LazyEmployee(int id) {
		this.id = id;
		// 对象初始化的时候，不再对所有的值域都进行了求值。
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
	 * 懒加载如下所示，只有等到真正需要的时候才去求值。 
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