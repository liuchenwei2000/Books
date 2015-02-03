/**
 * 
 */
package chapter10.item66;

import java.util.concurrent.TimeUnit;

/**
 * ����ʾ������Զ����ֹͣ���̡߳�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��1��26��
 */
public class StopThread1 {
	
	private static boolean stop;

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				/*
				 * ����Ĵ�����������Ż���������ʾ�Ӷ�������ѭ����
				 * if(!stop){
				 * 		while(true){
				 * 			i++;
				 * 		}
				 * } 
				 */
				while (!stop) {
					i++;
				}
				System.out.println("stoped at i=" + i);
			}
		});
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stop = true;
	}
}
