/**
 * 
 */
package principle.ISP;

/**
 * 具有定时功能的门演示类
 * <p>
 * 这是最初的代码，只有一个门(Door)类，一个定时器(Timer)类，一个定时器客户端(TimerClient)接口
 * 其中Door类和定时功能的相关类没有任何关系
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-31
 */
public class TimedDoorDemo {
}

/**
 * 门类
 */
abstract class Door {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * 木门，门的一个普通实现类
 */
class WoodDoor extends Door {

	public void lock() {
		// do something
	}

	public void unlock() {
		// do something
	}

	public boolean isLocked() {
		return false;
	}
}

/**
 * 定时器类
 */
class Timer {

	/**
	 * 注册一个定时客户端
	 * 
	 * @param timerClient
	 *            定时器客户端
	 * @param timeout
	 *            超时秒数
	 */
	public void register(TimerClient timerClient, int timeout) {
		for (int i = timeout; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 定时时间到了之后通知定时器客户端执行操作
		timerClient.timeOut();
	}
}

/**
 * 定时客户端
 */
interface TimerClient {

	/**
	 * 到了定时时间做的操作
	 */
	public void timeOut();
}