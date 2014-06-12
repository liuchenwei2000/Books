/**
 * 
 */
package chapter6.p67;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ʵ�����ҹ�����ڴ���Դ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-19
 */
public class Communication {

	// ���ڴ���Դ
	private FileInputStream fis;

	public Communication() {
		try {
			this.fis = new FileInputStream("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �����ͷŷ��ڴ���Դ��public�������������κ�ʱ������������á�
	 */
	public synchronized void cleanup() throws IOException {
		if (fis != null) {// ��ֹ����ظ�����
			fis.close();
			fis = null;
		}
	}

	/**
	 * ��д��finalize()��������cleanup()����JVM����finalize()ʱ���ͻ��ͷŷ��ڴ���Դ��
	 */
	@Override
	protected void finalize() throws Throwable {
		try {
			cleanup();
		} finally {
			super.finalize();
		}
	}
}