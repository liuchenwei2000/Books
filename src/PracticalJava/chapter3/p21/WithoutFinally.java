/**
 * 
 */
package chapter3.p21;

import java.io.FileReader;
import java.io.IOException;

/**
 * 不使用finally清理非内存资源的方式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-26
 */
public class WithoutFinally {

	/**
	 * 有重复代码并且比较混乱。
	 */
	public void foo() throws IOException {
		FileReader fr = new FileReader("a.txt");
		try {
			fr.read();
		} catch (IOException e) {
			fr.close();
			throw e;
		}
		if (fr != null) {
			fr.close();
		}
	}
}
