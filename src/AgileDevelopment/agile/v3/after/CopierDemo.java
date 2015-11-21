/**
 * 
 */
package agile.v3.after;

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
		// 如果想要打印在屏幕上，需要修改main方法(即客户端程序)，不需要修改Copier
		// 即使再增加其他输出设备，只要客户端程序自己设置上就可以了，不需修改Copier
		copier.setPrinter(new Screen());
		copier.copy();
	}
}

/**
 * 需求变更：从输入器读入数据并输出到输出设备打印出来
 * <p>
 * 敏捷团队的反应：修改设计并使修改后的设计对于这一类需求的变化具有弹性
 * 实际上修改遵循了OCP
 */
class Copier {

	public static final int EOF = -1;

	private Reader reader = new KeyboardReader();

	private Writer printer = new Printer();

	public void copy() {
		int c;
		while ((c = reader.read()) != EOF) {
			printer.print((char) c);
		}
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public void setPrinter(Writer printer) {
		this.printer = printer;
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

interface Writer {

	public void print(char c);
}

class Printer implements Writer {

	public void print(char c) {
		// print on paper
	}
}

class Screen implements Writer {

	public void print(char c) {
		// print on screen
	}
}
