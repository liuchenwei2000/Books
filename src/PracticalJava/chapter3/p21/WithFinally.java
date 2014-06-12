/**
 * 
 */
package chapter3.p21;

import java.io.FileReader;
import java.io.IOException;

/**
 * 使用finally清理非内存资源的方式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-26
 */
public class WithFinally {

	public void foo() throws IOException {
		FileReader fr = new FileReader("a.txt");
		try {
			fr.read();
		} finally {
			if (fr != null)
				fr.close();
		}
	}
}