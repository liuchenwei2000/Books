/**
 * 
 */
package classes.c5;

/**
 * ����
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
 */
public class Person {

	private Department department;

	public Person() {
		
	}
	
	/**
	 * ��ֻ����Ҫ��Person�ľ�����Ϣ
	 * ���������Ҳ����ɾ����
	 */
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department arg) {
		department = arg;
	}

	/**
	 * ����ͻ���ϣ��֪��ĳ�˵ľ�����˭���ͱ�����ȡ��Department����
	 * manager = person.getDepartment().getManager();
	 * �����ı���ͶԿͻ��˽�¶��Department�Ĺ���ԭ������Կͻ�������Department���Լ������
	 * Ϊ����Person�н���һ���򵥵�ί�к�����
	 */
	public Person getManager() {
		return getDepartment().getManager();
	}
	
	public static void main(String[] args) {
		Person tom = new Person();
		// û��ί�к������÷�
		tom.getDepartment().getManager();
		// ʹ��ί�к������÷�
		tom.getManager();
	}
}