/**
 * 
 */
package chapter5.p48;

/**
 * ��װ���õ����಻���ж��̰߳�ȫ��ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-11
 */
public class Demo {
}

class Foo {
	
	/* 
	 * ����ط��������private���εĻ��������û�����ֱ��ʹ��array������
	 * ������ݿɱ�ֱ���޸ģ����಻�پ����̰߳�ȫ�ԡ�
	 */
	private int[] array = new int[10];
	
	public synchronized void add(int[] other) {
		for (int i = 0; i < array.length; i++) {
			array[i] += other[i];
		}
	}
	
	public synchronized void sub(int[] other){
		for (int i = 0; i < array.length; i++) {
			array[i] -= other[i];
		}
	}
	
	/**
	 * ����ṩ����ķ��ʺ������Ǿͻ�ʹ�����û��ֿ���ֱ�Ӳ���array���ݣ����پ����̰߳�ȫ�ԡ�
	 * �޸ķ�����ʹ�������ʵ�ַ�ʽ����array�Ŀ�¡�汾���ظ����û���
	 */
	public int[] getArray() {
		return array;
	}
	
	/**
	 * ��������������Ϊsynchronized����ȷ��array�ڿ�¡�����в����۸ġ�
	 * ��ӵĿ�¡��Ϊ�����һЩ�������������̰߳�ȫ��������ġ�
	 */
	public synchronized int[] getArray2() {
		return array.clone();
	}
}