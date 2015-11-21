/**
 * 
 */
package agile.v3;

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
		// 如果想要打印在屏幕上，需要修改main方法(即客户端程序)，也需要修改Copier
		// 如果再增加一种输出设备，Copier就需要再次修改了，设计很僵硬
		copier.setPrintOnScreen(true);
		copier.copy();
	}
}

/**
 * 需求变更：从键盘或纸带读入数据并输出到打印机或屏幕打印出来
 */
class Copier {

	public static final int EOF = -1;

	private boolean isReadFromPaper = false;

	private KeyboardReader keyboardReader = new KeyboardReader();

	private PaperReader paperReader = new PaperReader();

	// 为了适应新需求，增加了一个boolean变量来解决问题
	private boolean isPrintOnScreen = false;

	private Printer printer = new Printer();

	private Screen screen = new Screen();

	public void copy() {
		int c;
		while ((c = isReadFromPaper ? paperReader.read() : keyboardReader.read()) != EOF) {
			if (isPrintOnScreen) {
				screen.print((char) c);
			} else {
				printer.print((char) c);
			}
		}
	}

	public void setReadFromPaper(boolean isReadFromPaper) {
		this.isReadFromPaper = isReadFromPaper;
	}

	public void setPrintOnScreen(boolean isPrintOnScreen) {
		this.isPrintOnScreen = isPrintOnScreen;
	}
}

class KeyboardReader {

	public int read() {
		// read from key board
		return 0;
	}
}

class PaperReader {

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

class Screen {

	public void print(char c) {
		// print on screen
	}
}
