/**
 * 
 */
package agile.v2.after;

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
		// �����Ҫ��ֽ���϶�ȡ��ֻ��Ҫ�޸�main����(���ͻ��˳���Ϳ����ˣ�����Ҫ�޸�Copier
		// ��ʹ������������������ֻҪ�ͻ��˳����Լ������ϾͿ����ˣ������޸�Copier
		copier.setReader(new PaperReader());
		copier.copy();
	}
}

/**
 * �����������������������ݲ��������ӡ����ӡ����
 * <p>
 * �����Ŷӵķ�Ӧ���޸���Ʋ�ʹ�޸ĺ����ƶ�����һ������ı仯���е���
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