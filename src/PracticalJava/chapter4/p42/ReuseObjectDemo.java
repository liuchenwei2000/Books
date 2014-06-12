/**
 * 
 */
package chapter4.p42;

/**
 * 复用对象示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-6
 */
public class ReuseObjectDemo {
	
	/**
	 * 下面的三个方法都是计算所有雇员的薪水总额
	 */
	
	/**
	 * 本方法大量的创建了对象，造成了不必要的性能开销。
	 */
	public static int totalSalary(int[] ids, String[] names) {
		int total = 0;
		for (int i = 0; i < ids.length; i++) {
			// 创建大量Employee对象
			Employee employee = new Employee(ids[i], names[i]);
			total += employee.salary();
		}
		return total;
	}
	
	/**
	 * 本方法复用了同一个对象，提高了性能。
	 */
	public static int totalSalary2(int[] ids, String[] names) {
		Employee employee = new Employee();
		int total = 0;
		for (int i = 0; i < ids.length; i++) {
			// 为了使服用技术发挥作用，Employee类必须提供一些函数，用来设置对象的各个值域。
			employee.setId(ids[i]);
			employee.setName(names[i]);
			total += employee.salary();
		}
		return total;
	}
	
	/**
	 * 如果Employee类没有提供setter函数，而你又可以接触源码，可以使用一种更高效的技术：
	 * 不再调用多个函数来设置对象的各值域，而是提供一个重新初始化函数，以一次调用代替多次调用。
	 */
	public static int totalSalary3(int[] ids, String[] names) {
		Employee employee = new Employee();
		int total = 0;
		for (int i = 0; i < ids.length; i++) {
			// 调用重新初始化函数
			employee.reinitialize(ids[i], names[i]);
			total += employee.salary();
		}
		return total;
	}
}

/**
 * 雇员类
 */
class Employee {
	
	private int id;// 员工编号
	private String name;
	
	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * 雇员薪水
	 */
	public int salary(){
		// 查询数据库操作
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
	 * 使用参数重新初始化对象
	 */
	public void reinitialize(int id, String name) {
		this.id = id;
		this.name = name;
	}
}