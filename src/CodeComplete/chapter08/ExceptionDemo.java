/**
 * 
 */
package chapter08;

import java.io.EOFException;

/**
 * �쳣������εĹ�ϵ��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-12-14
 */
public class ExceptionDemo {
}

/**
 * �׳������β�һ�µ��쳣����
 */
class Student1 {

	/**
	 * ��������Ѹ��ײ��EOFException(�ļ�����)�쳣���������ĵ��÷�
	 * ��������ӵ����һ�쳣����ͨ���Ѹ��ײ��һ�����ݸ�����÷�
	 * ��¶�������һЩʵ��ϸ��(�����ǻ�ȡidʱ���ȡ�ļ����ʵ��ϸ��)
	 * ����ʹ�õ��÷��������Student1���θ��͵��׳�EOFException�Ĵ������������
	 * �������ƻ��˷�װ�ԣ�Ҳ�����˴���������ϵĿɹ����ԡ�
	 */
	public String getID() throws EOFException {
		// some code
		throw new EOFException();
	}
}

/**
 * һ����һ�µĳ��������׳��쳣����
 */
class Student2 {

	/**
	 * �׳�StudentDataUnavailable�쳣�ͳ�ֵı��ֽӿڵĳ�����
	 */
	public String getID() throws StudentDataUnavailable {
		// some code
		// ֻ��Ҫ�ڴ����ｫEOFExceptionת��Ϊһ��StudentDataUnavailable�쳣����
		try {
			throw new EOFException();
		} catch (Exception e) {
			throw new StudentDataUnavailable();
		}
	}
}

class StudentDataUnavailable extends Exception {

	private static final long serialVersionUID = 1L;
}