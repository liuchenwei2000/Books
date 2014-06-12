/**
 * 
 */
package agile.v3;

/**
 * Copierʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-24
 */
public class CopierDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Copier copier = new Copier();
		// �����Ҫ��ӡ����Ļ�ϣ���Ҫ�޸�main����(���ͻ��˳���)��Ҳ��Ҫ�޸�Copier
		// ���������һ������豸��Copier����Ҫ�ٴ��޸��ˣ���ƺܽ�Ӳ
		copier.setPrintOnScreen(true);
		copier.copy();
	}
}

/**
 * ���������Ӽ��̻�ֽ���������ݲ��������ӡ������Ļ��ӡ����
 */
class Copier {

	public static final int EOF = -1;

	private boolean isReadFromPaper = false;

	private KeyboardReader keyboardReader = new KeyboardReader();

	private PaperReader paperReader = new PaperReader();

	// Ϊ����Ӧ������������һ��boolean�������������
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