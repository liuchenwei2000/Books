/**
 * 
 */
package chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * ѧ����������ʾ��
 * <p>
 * ������ʾ��Ľӿ�Ӧ��չ��һ�µĳ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-11-13
 */
public class StudentRosterDemo {
}

class Student {
}

/**
 * ѧ��������1
 * <p>
 * �����Ľӿڲ���Э������Ϊ���ĳ����β�һ��
 */
class StudentRoster1 {

	private List<Student> students = new ArrayList<Student>();

	/**
	 * ���������ӳ�������� ѧ�� ��һ����� 
	 */
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

	/**
	 * ���������ӳ�������� �б�  ��һ����� 
	 */
	
	public Student firstElement() {
		return students.get(0);
	}

	public Student lastElement() {
		return students.get(students.size() - 1);
	}
}

/**
 * ѧ��������2
 * <p>
 * ������������ӣ��������ֻ�ϵĳ���ͨ����Դ��
 * ����Աʹ������������������ʵ���ڲ��߼�����ȴû�а�ʹ�������һ��ʵ��������
 * ����ͨ����������Ӧ�öԳ������ಿ������������ʵ��ϸ�ڡ�
 */
class StudentRoster2 {

	private List<Student> students = new ArrayList<Student>();

	/**
	 * �����ĸ��ӳ�������� ѧ��  ��һ����� 
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