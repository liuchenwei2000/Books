/**
 * 
 */
package fields.f16.after;

/**
 * ����
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
 */
public class Person {

	private final boolean isMale;// �Ƿ�Ϊ��
	private final char code;// �Ա���

	private Person(boolean isMale, char code) {
		this.isMale = isMale;
		this.code = code;
	}

	/**
	 * ��������
	 */
	public static Person createMale() {
		return new Person(true, 'M');
	}

	/**
	 * ����Ů��
	 */
	public static Person createFemale() {
		return new Person(false, 'F');
	}

	/**
	 * @return the isMale
	 */
	public boolean isMale() {
		return isMale;
	}

	/**
	 * @return the code
	 */
	public char getCode() {
		return code;
	}
}