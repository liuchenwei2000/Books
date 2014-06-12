/**
 * 
 */
package chapter5.p50;

/**
 * ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-13
 */
public class Demo {

	/**
	 * ����һ�����͵����ӡ�
	 * 
	 * ��������������˳�����η�����
	 * 1��t1����setValue��������ֵ1��
	 * 2��t2����setValue��������ֵ2��
	 * 3��t1����getValue��������ֵ1��
	 * 
	 * ��Ϊ����value�洢�ڸ��̵߳�˽��ר�ø����У����Բ��ܱ�֤�����ڴ������ά��һ�¡�
	 * �ڵ�1���У��߳�1���Լ���ר�ø����з�������ֵ1��
	 * �ڵ�2���У��߳�2�����Լ���ר�ø����з�������ֵ2��
	 * ���˵�3�����߳�1����ר�ø����ж�ȡ��ֵ������1.
	 * ��Щ��ֵû�л��������ڴ������һ�»���
	 */
	public static void main(String[] args) {
		final Foo foo = new Foo();// ͬһ������
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				foo.setValue(1);// 1
				foo.getValue();// 3
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				foo.setValue(2);// 2
			}
		});
		
		t1.start();
		t2.start();
	}
}

class Foo {
	
	// ��������ͻᱻ�̹߳���
	private int value;

	// ������������ʵ�ֱ����ǲ��ɷָ�ģ�����Ȼ�ᵼ�²������⡣
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}