/**
 * 
 */
package fields.f16;

/**
 * Ů����
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
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