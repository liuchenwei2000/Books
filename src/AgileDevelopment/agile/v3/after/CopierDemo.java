/**
 * 
 */
package agile.v3.after;

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
		// �����Ҫ��ӡ����Ļ�ϣ���Ҫ�޸�main����(���ͻ��˳���)������Ҫ�޸�Copier
		// ��ʹ��������������豸��ֻҪ�ͻ��˳����Լ������ϾͿ����ˣ������޸�Copier
		copier.setPrinter(new Screen());
		copier.copy();
	}
}

/**
 * �����������������������ݲ����������豸��ӡ����
 * <p>
 * �����Ŷӵķ�Ӧ���޸���Ʋ�ʹ�޸ĺ����ƶ�����һ������ı仯���е���
 * ʵ�����޸���ѭ��OCP
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