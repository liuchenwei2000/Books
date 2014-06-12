/**
 * 
 */
package fields.f16;

/**
 * 女人类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Female extends Person {

	/**
	 * (non-Javadoc)
	 *
	 * @see f16.before.Person#getCode()
	 */
	@Override
	public char getCode() {
		return 'F';
	}

	/**
	 * (non-Javadoc)
	 *
	 * @see f16.before.Person#isMale()
	 */
	@Override
	public boolean isMale() {
		return false;
	}
}