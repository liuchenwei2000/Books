/**
 * 
 */
package agile.v1;

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
		copier.copy();
	}
}

/**
 * ԭʼ���󣺴Ӽ��̶������ݲ��������ӡ����ӡ����
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