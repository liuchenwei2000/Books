/**
 * 
 */
package chapter3.p21;

import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ��finally������ڴ���Դ�ķ�ʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-26
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