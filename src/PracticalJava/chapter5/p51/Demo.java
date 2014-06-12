/**
 * 
 */
package chapter5.p51;

/**
 * ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-16
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 9, 8, 7, 6, 5 };
		// ���뺯�����������鲢����Demo�����instance����
		Demo demo = new Demo();
		demo.sumArrays(a1, a2);
	}
	
	/**
	 * ���������Ȼ����Ϊsynchronized������Ȼ�������̰߳�ȫ�ԡ�
	 * 
	 * ������Ϊsynchronized�������Ƕ��󣬶��Ǻ�������룬�����������ݵ������������û�б�������
	 * ����һ���̸߳ı�δ����֮�����ʱ�򣬱�������Ȼ����ִ�У�����ʹ��ˡ�
	 */
	public synchronized int sumArrays(int[] a1, int[] a2) {
		int value = 0;
		int length = a1.length;
		if (length == a2.length) {
			for (int i = 0; i < length; i++) {
				value += a1[i] + a2[i];
			}
		}
		return value;
	}
	
	/**
	 * ���ԣ���ʱ�����ͬ������һ�������ǲ����ģ�������ͬ�����ƴ˺���������Ķ���
	 * �������Ժ����в�����ÿһ�����󶼼������ƣ���֤���̰߳�ȫ�ԡ�
	 */
	public int sumArrays2(int[] a1, int[] a2) {
		int value = 0;
		int length = a1.length;
		if (length == a2.length) {
			synchronized (a1) {
				synchronized (a2) {
					for (int i = 0; i < length; i++) {
						value += a1[i] + a2[i];
					}
				}
			}
		}
		return value;
	}
}