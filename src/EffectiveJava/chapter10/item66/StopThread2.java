/**
 * 
 */
package chapter10.item66;

import java.util.concurrent.TimeUnit;

/**
 * 正确示例：该线程会在一秒钟后停止。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年1月26日
 */
public class StopThread2 {
	
	// 为这个共享变量提供了同步控制的读写方法
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
				// 这里使用方法来读取 stop 变量的值
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
		// 这里使用方法来修改变量的值
		StopThread2.setStop(true);
	}

}
