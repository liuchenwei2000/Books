/**
 * 
 */
package agile.v1;

/**
 * Copier示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-24
 */
public class CopierDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Copier copier = new Copier();
		copier.copy();
	}
}

/**
 * 原始需求：从键盘读入数据并输出到打印机打印出来
 */
class Copier {

	public static final int EOF = -1;

	private KeyboardReader keyboardReader = new KeyboardReader();

	private Printer printer = new Printer();

	public void copy() {
		int c;
		while ((c = keyboardReader.read()) != EOF) {
			printer.print((char) c);
		}
	}
}

class KeyboardReader {

	public int read() {
		// read from key board
		return 0;
	}
}

class Printer {

	public void print(char c) {
		// print on paper
	}
}