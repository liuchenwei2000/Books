/**
 * 
 */
package fields.f16.after;

/**
 * 人类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Person {

	private final boolean isMale;// 是否为男
	private final char code;// 性别码

	private Person(boolean isMale, char code) {
		this.isMale = isMale;
		this.code = code;
	}

	/**
	 * 创建男性
	 */
	public static Person createMale() {
		return new Person(true, 'M');
	}

	/**
	 * 创建女性
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
