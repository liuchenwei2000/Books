/**
 * 
 */
package chapter4.p34;

/**
 * �̰߳�ȫ��Stack
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-2
 */
public class Stack {

	private int[] intArray;
	private int index = 0;

	public Stack(int size) {
		this.intArray = new int[size];
	}
	
	/**
	 * push()��pop()������synchronized�汾��non-synchronized�汾��Լ��5����
	 * ������Ϊ���ڻ�ȡ/�ͷ�lock�Ĵ��ۣ�����һ��С�ͺ������������ռ��������ִ��ʱ��ı����൱��
	 */
	public synchronized void push(int value) {
		this.intArray[index++] = value;
	}

	public synchronized int pop() {
		return this.intArray[--index];
	}

	/**
	 * contains()������synchronized�汾��non-synchronized�汾��Լ��10%��
	 * ��ҲҪ��ȡ/�ͷ�lock���������������������������������Щ�����Ի�ȡ/�ͷ�lock�Ĵ���ƽ����������������Ե�С�ˡ�
	 * ����һ���Դ��͵ĺ�������ȡ/�ͷ�lock�Ĵ���ֻռ������ִ��ʱ���һС���ֶ��ѡ�
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