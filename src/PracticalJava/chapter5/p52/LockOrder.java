/**
 * 
 */
package chapter5.p52;

/**
 * 对象含有锁顺序信息以避免死锁。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-16
 */
public class LockOrder {

	/**
	 * 重新定义sumArrays方法，使用ArrayWithLockOrder
	 */
	public int sumArrays(ArrayWithLockOrder a1, ArrayWithLockOrder a2) {
		int value = 0;
		int length = a1.getArray().length;
		if (length == a2.getArray().length) {
			// 根据对象的锁序号确定加锁顺序
			Object firstLock = a1;
			Object lastLock = a2;
			if (a1.getLockOrder() > a2.getLockOrder()) {
				firstLock = a2;
				lastLock = a1;
			}
			synchronized (firstLock) {
				synchronized (lastLock) {
					for (int i = 0; i < length; i++) {
						value += a1.getArray()[i] + a2.getArray()[i];
					}
				}
			}
		}
		return value;
	}
}
class ArrayWithLockOrder {
	
	// 对象锁计数器，类变量
	private static long numberOfLocks = 0;
	
	private long lockOrder;// 对象锁序号
	private int[] array;

	public ArrayWithLockOrder(int[] array) {
		this.array = array;
		// 初始化对象锁序号，保证并发安全。
		synchronized (ArrayWithLockOrder.class) {
			numberOfLocks++;
			lockOrder = numberOfLocks;
		}
	}

	public long getLockOrder() {
		return lockOrder;
	}

	public int[] getArray() {
		return array;
	}
}
