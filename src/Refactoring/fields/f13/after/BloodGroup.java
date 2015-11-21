/**
 * 
 */
package fields.f13.after;

/**
 * 血型类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-26
 */
public class BloodGroup {

	/** 允许创建的血型实体 */
	public static final BloodGroup O = new BloodGroup(0);
	public static final BloodGroup A = new BloodGroup(1);
	public static final BloodGroup B = new BloodGroup(2);
	public static final BloodGroup AB = new BloodGroup(3);
	
	private int code;// 血型编码

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
