/**
 * 
 */
package chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生花名册演示类
 * <p>
 * 用来演示类的接口应该展现一致的抽象层次
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-11-13
 */
public class StudentRosterDemo {
}

class Student {
}

/**
 * 学生花名册1
 * <p>
 * 这个类的接口不够协调，因为它的抽象层次不一致
 */
class StudentRoster1 {

	private List<Student> students = new ArrayList<Student>();

	/**
	 * 下面两个子程序抽象在 学生 这一层次上 
	 */
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

	/**
	 * 下面两个子程序抽象在 列表  这一层次上 
	 */
	
	public Student firstElement() {
		return students.get(0);
	}

	public Student lastElement() {
		return students.get(students.size() - 1);
	}
}

/**
 * 学生花名册2
 * <p>
 * 对于上面的例子，出现这种混合的抽象，通常是源于
 * 程序员使用容器类或其他类库来实现内部逻辑，但却没有把使用类库这一事实隐藏起来
 * 而这通常都是属于应该对程序其余部分隐藏起来的实现细节。
 */
class StudentRoster2 {

	private List<Student> students = new ArrayList<Student>();

	/**
	 * 下面四个子程序抽象在 学生  这一层次上 
	 */
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

	public Student firstStudent() {
		return students.get(0);
	}

	public Student lastStudent() {
		return students.get(students.size() - 1);
	}
}