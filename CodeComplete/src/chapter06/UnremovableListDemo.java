/**
 * 
 */
package chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * 不可移除的列表演示
 * <p>
 * 一定要理解类所实现的抽象是什么
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-11-13
 */
public class UnremovableListDemo {
}

/**
 * 不可删除元素的列表
 * <p>
 * 这个列表的公开接口应该有 add(T),get(int),size() 就足够了
 */
class UnremovableList<T> {

	// 内部使用List实现
	private List<T> list = new ArrayList<T>();

	public void add(T element) {
		list.add(element);
	}
	
	/**
	 * 这个方法就不应该出现在公开接口中
	 * 另外List的其余公开接口都应该被隐藏起来
	 * 因为UnremovableList只需要其中的三个就够了
	 */
	public void remove(T element) {
		list.remove(element);
	}

	public T get(int index) {
		return list.get(index);
	}

	public int size() {
		return list.size();
	}
}
