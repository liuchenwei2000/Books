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
 * 不掩盖异常示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-24
 */
public class NotHiddenException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			readFile();
		} catch (ReadFileExceptions e) {
			// 获取所有异常，进行下一步操作。
			e.getExceptions();
		}
	}
	
	/**
	 * 新异常类型，用来保存指向异常List的引用。
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
		// 异常List，用来记录本方法内发生的所有异常。
		List<Exception> exceptions = new ArrayList<Exception>();
		 
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("a.txt");
			br = new BufferedReader(fr);
			br.read();
			// ...
		} catch (FileNotFoundException e) {
			exceptions.add(e);// 添加一个异常
		} catch (IOException e) {
			exceptions.add(e);// 添加一个异常
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					exceptions.add(e);// 添加一个异常
				}
			}
			// 如果真有异常发生了，抛出新型异常，并把异常List传给它。
			if(exceptions.size() > 0) {
				throw new ReadFileExceptions(exceptions);
			}
		}
	}
}