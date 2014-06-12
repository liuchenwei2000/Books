/**
 * 
 */
package chapter5.p49;

/**
 * ͬ������ʾ��
 * <p>
 * Ϊ������Demo1�����⣬��ҪΪһ�������䱸���locks��
 * Java����û���ṩ�����Ĺ��ܣ���˲��ò������Լ��Ļ��ơ�
 * һ�������Ǵ���һЩ������Ϊinstance���ݣ���Щ������������ṩlocks��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-11
 */
public class Demo2 {
	
	@SuppressWarnings("unused")
	private int[] intArray;
	@SuppressWarnings("unused")
	private double[] doubleArray;
	
	private byte[] intArrayLock = new byte[0];
	private byte[] doubleArrayLock = new byte[0];
	
	/*
	 * ��������ʵ�ַ�ʽ��ʹ��ͬ�����Ƶ��Է����ڲ�ͬ�Ķ������ϣ��ò����ȸ��ߡ�
	 */
	
	public void modifyIntArray1() {
		synchronized (intArrayLock) {
			// ���ʲ����� intArray
		}
	}

	public void modifyIntArray2() {
		synchronized (intArrayLock) {
			// ���ʲ����� intArray
		}
	}

	public void modifyDoubleArray1() {
		synchronized (doubleArrayLock) {
			// ���ʲ����� intArray
		}
	}

	public void modifyDoubleArray2() {
		synchronized (doubleArrayLock) {
			// ���ʲ����� intArray
		}
	}
}