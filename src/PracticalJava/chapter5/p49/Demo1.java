/**
 * 
 */
package chapter5.p49;

/**
 * 无谓的同步控制示例
 * <p>
 * 由于synchronized关键词实现方式的缘故，常常导致无谓的同步控制，造成并发度的降低。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-11
 */
public class Demo1 {
	
	@SuppressWarnings("unused")
	private int[] intArray;
	@SuppressWarnings("unused")
	private double[] doubleArray;
	
	/*
	 * 下面四个方法，全都是synchronized，这样使得本类是线程安全的。
	 * 但是，前两个方法操纵的只有 intArray，后两个方法操纵的只有 doubleArray。
	 * 但这四个方法却要始终竞争同一个lock。
	 * 
	 * 这是因为Java同步控制机制并不十分粒度化导致的，它对每个对象只提供一个lock。
	 */
	
	public synchronized void modifyIntArray1(){
		// 访问并操作 intArray
	}
	
	public synchronized void modifyIntArray2(){
		// 访问并操作 intArray
	}
	
	public synchronized void modifyDoubleArray1(){
		// 访问并操作 doubleArray
	}
	
	public synchronized void modifyDoubleArray2(){
		// 访问并操作 doubleArray
	}
}
