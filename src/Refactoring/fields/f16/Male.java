/**
 * 
 */
package fields.f16;

/**
 * 男人类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Male extends Person {

	/**
	 * (non-Javadoc)
	 *
	 * @see f16.before.Person#getCode()
	 */
	@Override
	public char getCode() {
		return 'M';
	}

	/**
	 * (non-Javadoc)
	 *
	 * @see f16.before.Person#isMale()
	 */
	@Override
	public boolean isMale() {
		return true;
	}
}