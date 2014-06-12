/**
 * 
 */
package chapter5.p49;

/**
 * ��ν��ͬ������ʾ��
 * <p>
 * ����synchronized�ؼ���ʵ�ַ�ʽ��Ե�ʣ�����������ν��ͬ�����ƣ���ɲ����ȵĽ��͡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-11
 */
public class Demo1 {
	
	@SuppressWarnings("unused")
	private int[] intArray;
	@SuppressWarnings("unused")
	private double[] doubleArray;
	
	/*
	 * �����ĸ�������ȫ����synchronized������ʹ�ñ������̰߳�ȫ�ġ�
	 * ���ǣ�ǰ�����������ݵ�ֻ�� intArray���������������ݵ�ֻ�� doubleArray��
	 * �����ĸ�����ȴҪʼ�վ���ͬһ��lock��
	 * 
	 * ������ΪJavaͬ�����ƻ��Ʋ���ʮ�����Ȼ����µģ�����ÿ������ֻ�ṩһ��lock��
	 */
	
	public synchronized void modifyIntArray1(){
		// ���ʲ����� intArray
	}
	
	public synchronized void modifyIntArray2(){
		// ���ʲ����� intArray
	}
	
	public synchronized void modifyDoubleArray1(){
		// ���ʲ����� doubleArray
	}
	
	public synchronized void modifyDoubleArray2(){
		// ���ʲ����� doubleArray
	}
}
