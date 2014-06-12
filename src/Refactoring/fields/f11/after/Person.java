/**
 * 
 */
package fields.f11.after;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import fields.f11.Course;

/**
 * 人类(新)
 * 
 * 进行对集合的封装之后，只能通过add和remove方法修改集合
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-26
 */
public class Person {

	private Set<Course> courses = new HashSet<Course>();// 课程

	public Person() {
	}

	/**
	 * 返回不可修改的集合视图
	 * 
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return Collections.unmodifiableSet(courses);
	}

//	/**
//	 * 初始化集合
//	 * 
//	 * @param courses
//	 *            the courses to init
//	 */
//	public void initCourses(Set<Course> courses) {
//		if (this.courses.isEmpty())
//			this.courses.addAll(courses);
//	}

	/**
	 * 添加新课程
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		courses.add(course);
	}

	/**
	 * 删除课程
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		courses.remove(course);
	}

	/**
	 * 返回高级课程数目
	 * 
	 * @return int
	 */
	public int getNumberOfAdvancedCourses() {
		int counter = 0;
		Iterator<Course> it = this.getCourses().iterator();
		while (it.hasNext()) {
			Course course = (Course) it.next();
			if (course.isAdvanced())
				counter++;
		}
		return counter;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		Course math = new Course("Math", true);
		// 增加课程(只能通过这种方法设置课程)
		person.addCourse(new Course("English", false));
		person.addCourse(math);
		// 删除课程
		person.removeCourse(math);
		// 查看高级课程数目
		person.getNumberOfAdvancedCourses();
	}
}