/**
 * 
 */
package chapter3.p22;

/**
 * ��try�����з���ֵʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-27
 */
public class ReturnInTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ӡ���£�method returns 2
		System.out.println("method returns " + method());
	}

	@SuppressWarnings("finally")
	private static int method() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}