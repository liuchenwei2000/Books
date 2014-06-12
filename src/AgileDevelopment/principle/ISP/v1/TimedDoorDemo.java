/**
 * 
 */
package principle.ISP.v1;

/**
 * 具有定时功能的门演示类
 * <p>
 * 现在需要一个具有定时功能的门，于是基于最初的代码进行了如下的改动，不遵循ISP
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-31
 */
public class TimedDoorDemo {
}

/**
 * 门类
 * <p>
 * 为了给一个子类带来好处，接口中增加一个方法，
 * 即继承自TimerClient的timeOut()方法
 */
abstract class Door implements TimerClient {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * 木门，门的一个普通实现类
 * <p>
 * 虽然本类不需要的定时功能，但是Door增加了一个新方法，所以也必须要改变以实现基类的新方法
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

	/**
	 * 即使木门不需要，也要实现
	 */
	public void timeOut() {
		// do nothing
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

/**
 * 具有定时功能的门
 */
class TimedDoor extends Door {

	public void timeOut() {
	}

	public void lock() {
	}

	public void unlock() {
	}

	public boolean isLocked() {
		return false;
	}
}