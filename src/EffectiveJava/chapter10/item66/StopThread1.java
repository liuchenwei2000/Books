/**
 * 
 */
package chapter10.item66;

import java.util.concurrent.TimeUnit;

/**
 * 错误示例：永远不会停止的线程。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年1月26日
 */
public class StopThread1 {
	
	private static boolean stop;

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				/*
				 * 下面的代码虚拟机会优化成如下所示从而陷入死循环：
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
