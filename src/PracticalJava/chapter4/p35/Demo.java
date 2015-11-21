/**
 * 
 */
package chapter4.p35;

/**
 * 示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-2
 */
public class Demo {

	private static int staticSum;

	private int instanceSum;

	/**
	 * 通过stack变量进行运算
	 * <p>
	 * 本方法比下面两种方法也快上2-3倍。
	 * 访问stack变量之所以能够如此之快，是因为JVM所做的相应工作
	 * 远少于访问static变量或instance变量所做的工作。
	 */
	public int stackAcces(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += 1;
		}
		return sum;
	}

	/**
	 * 通过static变量进行运算
	 */
	public int staticAcces(int n) {
		for (int i = 0; i < n; i++) {
			staticSum += 1;
		}
		return staticSum;
	}

	/**
	 * 通过instance变量进行运算
	 */
	public int instanceAcces(int n) {
		for (int i = 0; i < n; i++) {
			instanceSum += 1;
		}
		return instanceSum;
	}
	
	/**
	 * 下面两个方法，可以在满足需要的情况下大幅提升性能。
	 */
	public int staticAcces2(int n) {
		int sum = staticSum;
		for (int i = 0; i < n; i++) {
			sum += 1;
		}
		staticSum = sum;
		return staticSum;
	}

	public int instanceAcces2(int n) {
		int sum = instanceSum;
		for (int i = 0; i < n; i++) {
			sum += 1;
		}
		instanceSum = sum;
		return instanceSum;
	}
}
