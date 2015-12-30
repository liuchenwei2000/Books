/**
 * 
 */
package chapter5.item21;

/**
 * 扑克牌花色枚举
 * <p>
 * 使用Java原生enum类型实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2011-3-14
 */
public enum SuitEnum {
	
	CLUBS("clubs"), DIAMONDS("diamonds"), HEARTS("hearts"), SPADES("spades");

	private final String name;

	private SuitEnum(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
