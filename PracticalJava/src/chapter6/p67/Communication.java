/**
 * 
 */
package chapter6.p67;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 实现自我管理非内存资源的类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-19
 */
public class Communication {

	// 非内存资源
	private FileInputStream fis;

	public Communication() {
		try {
			this.fis = new FileInputStream("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 负责释放非内存资源的public方法，可以在任何时候被其他代码调用。
	 */
	public synchronized void cleanup() throws IOException {
		if (fis != null) {// 防止多次重复调用
			fis.close();
			fis = null;
		}
	}

	/**
	 * 重写了finalize()，它调用cleanup()。当JVM调用finalize()时，就会释放非内存资源。
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
