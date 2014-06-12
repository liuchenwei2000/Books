/**
 * 
 */
package chapter3.p18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * �ڸ��쳣ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-11-24
 */
public class HiddenException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			/*
			 * �����Exception in main(),caught by:Third Exception
			 * 
			 * 1�׳����쳣��2�׳����쳣�ڸ��ˣ�2�׳����쳣��3�׳����쳣�ڸ��ˡ�
			 * ����3�׳����쳣�������������׳����쳣(�Է���ʱ�����)
			 * ���ԣ����ͳ�Ϊ��������������ɵ��쳣�������쳣�����ڸ��ˡ�
			 */
			System.out.println("Exception in main(),caught by:"
					+ e.getMessage());
		}
	}

	@SuppressWarnings("finally")
	private static void test() throws Exception {
		try {
			throw new Exception("First Exception");// 1
		} catch (Exception e) {
			throw new Exception("Second Exception");// 2
		} finally {
			throw new Exception("Third Exception");// 3
		}
	}
	
	/**
	 * �����ڸ��쳣�������ڳ���Java������Ҳ�ܳ��������������ʾ����
	 * 1����׳�FileNotFoundException�����п��ܻᱻ2�׳���IOException�ڸǡ�
	 */
	public static void readFile() throws FileNotFoundException, IOException {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("a.txt");// 1
			br = new BufferedReader(fr);
			br.read();
			// ...
		} finally {
			if (br != null) {
				br.close();// 2
			}
		}
	}
}