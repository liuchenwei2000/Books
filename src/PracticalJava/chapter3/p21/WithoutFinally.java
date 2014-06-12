/**
 * 
 */
package chapter3.p21;

import java.io.FileReader;
import java.io.IOException;

/**
 * ��ʹ��finally������ڴ���Դ�ķ�ʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-26
 */
public class WithoutFinally {

	/**
	 * ���ظ����벢�ұȽϻ��ҡ�
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