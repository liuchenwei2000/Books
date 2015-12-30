/**
 * 
 */
package fields.f11;

/**
 * 课程类
 * 
 * @author 刘晨伟
 * 
 * 创建时间：2007-10-26
 */
public class Course {

	private String name;// 课程名
	private boolean isAdvanced;// 是否是高级课程
	
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
