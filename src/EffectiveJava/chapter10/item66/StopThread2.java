/**
 * 
 */
package chapter10.item66;

import java.util.concurrent.TimeUnit;

/**
 * ��ȷʾ�������̻߳���һ���Ӻ�ֹͣ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��1��26��
 */
public class StopThread2 {
	
	// Ϊ�����������ṩ��ͬ�����ƵĶ�д����
	private static boolean stop;
	
	public synchronized static boolean isStop() {
		return stop;
	}

	public synchronized static void setStop(boolean stop) {
		StopThread2.stop = stop;
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				int i = 0;
				// ����ʹ�÷�������ȡ stop ������ֵ
				while(!StopThread2.isStop()){
					i++;
				}
				System.out.println("stoped at i=" + i);
			}});
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ����ʹ�÷������޸ı�����ֵ
		StopThread2.setStop(true);
	}

}
