/**
 * 
 */
package agile.v2.after;

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
		// 如果想要从纸带上读取，只需要修改main方法(即客户端程序就可以了，不需要修改Copier
		// 即使再增加其他输入器，只要客户端程序自己设置上就可以了，不需修改Copier
		copier.setReader(new PaperReader());
		copier.copy();
	}
}

/**
 * 需求变更：从输入器读入数据并输出到打印机打印出来
 * <p>
 * 敏捷团队的反应：修改设计并使修改后的设计对于这一类需求的变化具有弹性
 */
class Copier {

	public static final int EOF = -1;

	private Reader reader = new KeyboardReader();

	private Printer printer = new Printer();

	public void copy() {
		int c;
		while ((c = reader.read()) != EOF) {
			printer.print((char) c);
		}
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}
}

interface Reader {

	public int read();
}

class KeyboardReader implements Reader {

	public int read() {
		// read from key board
		return 0;
	}
}

class PaperReader implements Reader {

	public int read() {
		// read from paper
		return 1;
	}
}

class Printer {

	public void print(char c) {
		// print on paper
	}
}
