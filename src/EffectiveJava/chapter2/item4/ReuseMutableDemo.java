/**
 * 
 */
package chapter2.item4;

import java.util.Calendar;
import java.util.Date;

/**
 * ���ÿɱ������ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-12-21
 */
public class ReuseMutableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnreuseMutable urm = new UnreuseMutable(new Date());
		System.out.println(urm.is21Century() ? "21Century" : "not 21Century");
		ReuseMutable rm = new ReuseMutable(new Date());
		System.out.println(rm.is21Century() ? "21Century" : "not 21Century");
	}
}

/**
 * û���ÿɱ����
 */
class UnreuseMutable {

	private Date date;

	public UnreuseMutable(Date date) {
		this.date = date;
	}

	/**
	 * ÿ�ε�����������������´���һ��Calendar����Calendar������һ���ɱ����
	 */
	public boolean is21Century() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
		return date.compareTo(calendar.getTime()) >= 0;
	}
}

/**
 * ���ÿɱ����
 */
class ReuseMutable {

	// ��Calendar��������Ϊ��̬��
	private static Calendar calendar = Calendar.getInstance();

	// ������ص�ʱ����г�ʼ������Ϊ����ֵһ������������Ͳ����ٸı���
	static {
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
	}

	private Date date;

	public ReuseMutable(Date date) {
		this.date = date;
	}

	/**
	 * ÿ�ε�����������������ÿɱ����calendar
	 */
	public boolean is21Century() {
		return date.compareTo(calendar.getTime()) >= 0;
	}
}