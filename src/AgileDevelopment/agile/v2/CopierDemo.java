/**
 * 
 */
package agile.v2;

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
		// �����Ҫ��ֽ���϶�ȡ����Ҫ�޸�main����(���ͻ��˳���)��Ҳ��Ҫ�޸�Copier
		// ���������һ����������Copier����Ҫ�ٴ��޸��ˣ���ƺܽ�Ӳ
		copier.setReadFromPaper(true);
		copier.copy();
	}
}

/**
 * ���������Ӽ��̻�ֽ���������ݲ��������ӡ����ӡ����
 */
class Copier {

	public static final int EOF = -1;

	// Ϊ����Ӧ������������һ��boolean�������������
	private boolean isReadFromPaper = false;

	private KeyboardReader keyboardReader = new KeyboardReader();

	private PaperReader paperReader = new PaperReader();

	private Printer printer = new Printer();

	public void copy() {
		int c;
		while ((c = isReadFromPaper ? paperReader.read() : keyboardReader.read()) != EOF) {
			printer.print((char) c);
		}
	}

	public void setReadFromPaper(boolean isReadFromPaper) {
		this.isReadFromPaper = isReadFromPaper;
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