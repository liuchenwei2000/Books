/**
 * 
 */
package fields.f11;

/**
 * �γ���
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-26
 */
public class Course {

	private String name;// �γ���
	private boolean isAdvanced;// �Ƿ��Ǹ߼��γ�
	
	public Course(String name, boolean isAdvanced) {
		this.name = name;
		this.isAdvanced = isAdvanced;
	}
	
	/**
	 * @return
	 */
	public boolean isAdvanced() {
		return isAdvanced;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}