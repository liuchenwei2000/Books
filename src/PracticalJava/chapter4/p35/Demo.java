/**
 * 
 */
package chapter4.p35;

/**
 * ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-2
 */
public class Demo {

	private static int staticSum;

	private int instanceSum;

	/**
	 * ͨ��stack������������
	 * <p>
	 * ���������������ַ���Ҳ����2-3����
	 * ����stack����֮�����ܹ����֮�죬����ΪJVM��������Ӧ����
	 * Զ���ڷ���static������instance���������Ĺ�����
	 */
	public int stackAcces(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += 1;
		}
		return sum;
	}

	/**
	 * ͨ��static������������
	 */
	public int staticAcces(int n) {
		for (int i = 0; i < n; i++) {
			staticSum += 1;
		}
		return staticSum;
	}

	/**
	 * ͨ��instance������������
	 */
	public int instanceAcces(int n) {
		for (int i = 0; i < n; i++) {
			instanceSum += 1;
		}
		return instanceSum;
	}
	
	/**
	 * ��������������������������Ҫ������´���������ܡ�
	 */
	public int staticAcces2(int n) {
		int sum = staticSum;
		for (int i = 0; i < n; i++) {
			sum += 1;
		}
		staticSum = sum;
		return staticSum;
	}

	public int instanceAcces2(int n) {
		int sum = instanceSum;
		for (int i = 0; i < n; i++) {
			sum += 1;
		}
		instanceSum = sum;
		return instanceSum;
	}
}