/**
 * 
 */
package fields.f15.after;

/**
 * Manager����
 * 
 * @author ����ΰ
 * 
 * ����ʱ�䣺2007-10-29
 */
public class Manager extends EmployeeType {

	/**
	 * (non-Javadoc)
	 *
	 * @see f15.after.EmployeeType#getTypeCode()
	 */
	@Override
	public int getTypeCode() {
		return EmployeeType.MANAGER;
	}
}