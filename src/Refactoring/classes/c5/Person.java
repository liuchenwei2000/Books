/**
 * 
 */
package classes.c5;

/**
 * 人类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Person {

	private Department department;

	public Person() {
		
	}
	
	/**
	 * 若只是需要该Person的经理信息
	 * 则这个函数也可以删除掉
	 */
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department arg) {
		department = arg;
	}

	/**
	 * 如果客户端希望知道某人的经理是谁，就必须先取得Department对象：
	 * manager = person.getDepartment().getManager();
	 * 这样的编码就对客户端揭露了Department的工作原理，如果对客户端隐藏Department可以减少耦合
	 * 为此在Person中建立一个简单的委托函数：
	 */
	public Person getManager() {
		return getDepartment().getManager();
	}
	
	public static void main(String[] args) {
		Person tom = new Person();
		// 没有委托函数的用法
		tom.getDepartment().getManager();
		// 使用委托函数的用法
		tom.getManager();
	}
}