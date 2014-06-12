/**
 * 
 */
package chapter3.item7;

/**
 * ��׼equals����ʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-2-17
 */
public class EqualsDemo {
}

class MyClass {
	
	private int number;
	private char ch;

	public MyClass(int number, char ch) {
		super();
		this.number = number;
		this.ch = ch;
	}

	public boolean equals(Object obj) {
		if (this == obj)// 1
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MyClass))// 2
			return false;
		MyClass other = (MyClass) obj;// 3
		return other.number == this.number && other.ch == this.ch;// 4
	}
}