/**
 * 
 */
package principle.ISP.v2;

/**
 * 具有定时功能的门演示类
 * <p>
 * 现在定时器需要记录每次定时的信息，以便于定时到了之后进行识别
 * 也就是说定时器系统需要调整自己的接口
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
abstract class Door implements TimerClient {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * 木门，门的一个普通实现类
 * <p>
 * 由于定时器系统的接口变更，本类也不得不进行修改
 * 这个修正还会影响到Door的其他子类和所有客户程序，这是僵化性和粘滞性的
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
	 * 即使木门不需要，也要修改本方法
	 */
	public void timeOut(int timeOutID) {
	}
}

/**
 * 定时器类
 * <p>
 * 改变了接口，增加了一个参数
 */
class Timer {

	/**
	 * 注册一个定时客户端
	 * 
	 * @param timerClient
	 *            定时器客户端
	 * @param timeout
	 *            超时秒数
	 * @param timeOutID 
	 *            超时ID
	 */
	public void register(TimerClient timerClient, int timeout, int timeOutID) {
		for (int i = timeout; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 定时时间到了之后通知定时器客户端执行操作
		timerClient.timeOut(timeOutID);
	}
}

/**
 * 定时客户端
 * <p>
 * 改变了接口，增加了一个参数
 */
interface TimerClient {

	/**
	 * 到了定时时间做的操作
	 * 
	 * @param timeOutID
	 *            超时ID
	 */
	public void timeOut(int timeOutID);
}

/**
 * 具有定时功能的门
 */
class TimedDoor extends Door {

	public void lock() {
	}

	public void unlock() {
	}

	public boolean isLocked() {
		return false;
	}

	public void timeOut(int timeOutID) {
	}
}
