/**
 * 
 */
package fields.f13.after;

/**
 * Ѫ����
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-26
 */
public class BloodGroup {

	/** ��������Ѫ��ʵ�� */
	public static final BloodGroup O = new BloodGroup(0);
	public static final BloodGroup A = new BloodGroup(1);
	public static final BloodGroup B = new BloodGroup(2);
	public static final BloodGroup AB = new BloodGroup(3);
	
	private int code;// Ѫ�ͱ���

	private BloodGroup(int code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
}