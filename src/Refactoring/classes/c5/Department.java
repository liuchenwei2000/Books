/**
 * 
 */
package classes.c5;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
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