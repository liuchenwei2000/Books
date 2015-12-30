/**
 * 
 */
package fields.f11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 人类(旧)
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-26
 */
public class Person {

	private Set<Course> courses;// 课程

	public Person() {
	}

	/**
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	/**
	 * 演示使用本类的过程
	 */
	public static void main(String[] args) {
		Person person = new Person();
		// 设置课程
		Set<Course> courses = new HashSet<Course>();
		courses.add(new Course("English", false));
		courses.add(new Course("Math", true));
		person.setCourses(courses);
		// 添加新课程
		Course java = new Course("Java", true);
		person.getCourses().add(java);
		// 删除课程
		person.getCourses().remove(java);
		// 查看高级课程数目
		int counter = 0;
		Iterator<Course> it = person.getCourses().iterator();
		while (it.hasNext()) {
			Course course = (Course) it.next();
			if (course.isAdvanced())
				counter++;
		}
	}
}
