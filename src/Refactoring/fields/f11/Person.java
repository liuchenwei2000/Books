/**
 * 
 */
package fields.f11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ����(��)
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-26
 */
public class Person {

	private Set<Course> courses;// �γ�

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
	 * ��ʾʹ�ñ���Ĺ���
	 */
	public static void main(String[] args) {
		Person person = new Person();
		// ���ÿγ�
		Set<Course> courses = new HashSet<Course>();
		courses.add(new Course("English", false));
		courses.add(new Course("Math", true));
		person.setCourses(courses);
		// ����¿γ�
		Course java = new Course("Java", true);
		person.getCourses().add(java);
		// ɾ���γ�
		person.getCourses().remove(java);
		// �鿴�߼��γ���Ŀ
		int counter = 0;
		Iterator<Course> it = person.getCourses().iterator();
		while (it.hasNext()) {
			Course course = (Course) it.next();
			if (course.isAdvanced())
				counter++;
		}
	}
}