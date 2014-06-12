/**
 * 
 */
package fields.f15.after;

/**
 * Engineer类型
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-29
 */
public class Engineer extends EmployeeType {

	/**
	 * (non-Javadoc)
	 *
	 * @see f15.after.EmployeeType#getTypeCode()
	 */
	@Override
	public int getTypeCode() {
		return EmployeeType.ENGINEER;
	}
}