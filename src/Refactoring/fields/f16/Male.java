/**
 * 
 */
package fields.f16;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
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