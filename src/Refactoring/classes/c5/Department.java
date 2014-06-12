/**
 * 
 */
package classes.c5;

/**
 * 部门类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Department {
	
	private Person manager;

	public Department(Person manager) {
		this.manager = manager;
	}

	public Person getManager() {
		return manager;
	}
}