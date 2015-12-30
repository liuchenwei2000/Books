/**
 * 
 */
package chapter5.item21;

/**
 * 扑克牌花色枚举
 * <p>
 * 使用类型安全枚举模式实现。
 * <p>
 * 因为客户没有办法创建这个类的对象，也无法扩展这个类，
 * 所以，除了这些公有的静态final域声明的Suit对象之外，不会再有别的对象存在。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2011-3-14
 */
public class Suit {

	public static final Suit CLUBS = new Suit("clubs");// 黑桃
	public static final Suit DIAMONDS = new Suit("diamonds");// 方块
	public static final Suit HEARTS = new Suit("hearts");// 红桃
	public static final Suit SPADES = new Suit("spades");// 梅花

	private final String name;

	private Suit(String name) {
		this.name = name;
	}

	/**
	 * 因为类型安全枚举类是完全意义上的类，所以可以像以前介绍的那样改写
	 * toString方法，从而允许其中的值被转换为可打印的字符串。
	 * 注意，只有toString方法用到了字符串名字，equals比较操作并没有用到它，
	 * 因为从Object继承得来的equals实现只执行引用比较。
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
