/**
 * 
 */
package chapter3.p22;

/**
 * 在try区段中返回值示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-27
 */
public class ReturnInTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 打印如下：method returns 2
		System.out.println("method returns " + method());
	}

	@SuppressWarnings("finally")
	private static int method() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}