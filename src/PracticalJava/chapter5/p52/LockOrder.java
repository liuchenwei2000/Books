/**
 * 
 */
package chapter5.p52;

/**
 * ��������˳����Ϣ�Ա���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-16
 */
public class LockOrder {

	/**
	 * ���¶���sumArrays������ʹ��ArrayWithLockOrder
	 */
	public int sumArrays(ArrayWithLockOrder a1, ArrayWithLockOrder a2) {
		int value = 0;
		int length = a1.getArray().length;
		if (length == a2.getArray().length) {
			// ���ݶ���������ȷ������˳��
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
	
	// �������������������
	private static long numberOfLocks = 0;
	
	private long lockOrder;// ���������
	private int[] array;

	public ArrayWithLockOrder(int[] array) {
		this.array = array;
		// ��ʼ����������ţ���֤������ȫ��
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