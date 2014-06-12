/**
 * 
 */
package chapter3.p18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 掩盖异常示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-24
 */
public class HiddenException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			/*
			 * 输出：Exception in main(),caught by:Third Exception
			 * 
			 * 1抛出的异常被2抛出的异常掩盖了，2抛出的异常被3抛出的异常掩盖了。
			 * 由于3抛出的异常是这个函数最后抛出的异常(以发生时间而言)
			 * 所以，它就成为这个函数最终生成的异常，其他异常都被掩盖了。
			 */
			System.out.println("Exception in main(),caught by:"
					+ e.getMessage());
		}
	}

	@SuppressWarnings("finally")
	private static void test() throws Exception {
		try {
			throw new Exception("First Exception");// 1
		} catch (Exception e) {
			throw new Exception("Second Exception");// 2
		} finally {
			throw new Exception("Third Exception");// 3
		}
	}
	
	/**
	 * 上述掩盖异常的现象在常规Java代码中也很常见，看这个方法示例：
	 * 1如果抛出FileNotFoundException，则有可能会被2抛出的IOException掩盖。
	 */
	public static void readFile() throws FileNotFoundException, IOException {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("a.txt");// 1
			br = new BufferedReader(fr);
			br.read();
			// ...
		} finally {
			if (br != null) {
				br.close();// 2
			}
		}
	}
}