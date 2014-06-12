/**
 * 
 */
package chapter3.p18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ���ڸ��쳣ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-24
 */
public class NotHiddenException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			readFile();
		} catch (ReadFileExceptions e) {
			// ��ȡ�����쳣��������һ��������
			e.getExceptions();
		}
	}
	
	/**
	 * ���쳣���ͣ���������ָ���쳣List�����á�
	 */
	static class ReadFileExceptions extends IOException {

		private static final long serialVersionUID = 1L;
		
		private List<Exception> exceptions;

		public ReadFileExceptions(List<Exception> exceptions) {
			this.exceptions = exceptions;
		}

		public List<Exception> getExceptions() {
			return exceptions;
		}
	}
	
	public static void readFile() throws ReadFileExceptions {
		// �쳣List��������¼�������ڷ����������쳣��
		List<Exception> exceptions = new ArrayList<Exception>();
		 
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("a.txt");
			br = new BufferedReader(fr);
			br.read();
			// ...
		} catch (FileNotFoundException e) {
			exceptions.add(e);// ���һ���쳣
		} catch (IOException e) {
			exceptions.add(e);// ���һ���쳣
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					exceptions.add(e);// ���һ���쳣
				}
			}
			// ��������쳣�����ˣ��׳������쳣�������쳣List��������
			if(exceptions.size() > 0) {
				throw new ReadFileExceptions(exceptions);
			}
		}
	}
}