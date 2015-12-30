/**
 * 
 */
package chapter4.p34;

/**
 * 线程安全的Stack
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-2
 */
public class Stack {

	private int[] intArray;
	private int index = 0;

	public Stack(int size) {
		this.intArray = new int[size];
	}
	
	/**
	 * push()和pop()方法的synchronized版本比non-synchronized版本大约慢5倍。
	 * 这是因为由于获取/释放lock的代价，对于一个小型函数，这个代价占函数总体执行时间的比例相当大。
	 */
	public synchronized void push(int value) {
		this.intArray[index++] = value;
	}

	public synchronized int pop() {
		return this.intArray[--index];
	}

	/**
	 * contains()方法的synchronized版本比non-synchronized版本大约慢10%。
	 * 它也要获取/释放lock，不过由于它比上述两个函数的体积大些，所以获取/释放lock的代价平均下来，其比例就显得小了。
	 * 对于一个稍大型的函数，获取/释放lock的代价只占函数总执行时间的一小部分而已。
	 */
	public synchronized boolean contains(int value) {
		int size = intArray.length;
		for (int i = 0; i < size; i++) {
			if (value == intArray[i]) {
				return true;
			}
		}
		return false;
	}
}
