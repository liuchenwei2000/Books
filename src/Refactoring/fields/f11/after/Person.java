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
 * ����(��)
 * 
 * ���жԼ��ϵķ�װ֮��ֻ��ͨ��add��remove�����޸ļ���
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-26
 */
public class Person {

	private Set<Course> courses = new HashSet<Course>();// �γ�

	public Person() {
	}

	/**
	 * ���ز����޸ĵļ�����ͼ
	 * 
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return Collections.unmodifiableSet(courses);
	}

//	/**
//	 * ��ʼ������
//	 * 
//	 * @param courses
//	 *            the courses to init
//	 */
//	public void initCourses(Set<Course> courses) {
//		if (this.courses.isEmpty())
//			this.courses.addAll(courses);
//	}

	/**
	 * ����¿γ�
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		courses.add(course);
	}

	/**
	 * ɾ���γ�
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		courses.remove(course);
	}

	/**
	 * ���ظ߼��γ���Ŀ
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
		// ���ӿγ�(ֻ��ͨ�����ַ������ÿγ�)
		person.addCourse(new Course("English", false));
		person.addCourse(math);
		// ɾ���γ�
		person.removeCourse(math);
		// �鿴�߼��γ���Ŀ
		person.getNumberOfAdvancedCourses();
	}
}