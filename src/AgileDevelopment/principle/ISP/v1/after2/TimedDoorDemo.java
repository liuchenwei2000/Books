/**
 * 
 */
package principle.ISP.v1.after2;

/**
 * 具有定时功能的门演示类
 * <p>
 * 现在需要一个具有定时功能的门，于是基于最初的代码进行了如下的改动，遵循ISP
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
 * 不再做任何修改
 */
abstract class Door {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * 木门，门的一个普通实现类
 * <p>
 * 这时候就不需要对本类进行任何变动了
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

/**
 * 具有定时功能的门
 * <p>
 * 继承自Door，并且实现了TimerClient，因此具有定时功能了
 * <p>
 * 使用委托分离接口，也就是对象的适配器模式
 */
class TimedDoor extends Door {

	public void lock() {
	}

	public void unlock() {
	}

	public boolean isLocked() {
		return false;
	}
	
	public void doorTimeOut() {
	}
}

/**
 * TimedDoor的适配器，以便于可以完成定时功能
 * <p>
 * 这个解决方案不太优雅，每次想要为TimedDoor注册一个超时请求时，
 * 都要去创建一个新的适配器对象(TimedDoorAdapter)，这会占用内存并影响运行时间
 * 通常会优先选择类的适配器模式，只有当TimedDoorAdapter对象所要做的转换是必须的
 * (如无法修改TimedDoor的源码)，或者不同的时候会需要不同的转换时，才会选择对象的适配器模式
 */
class TimedDoorAdapter implements TimerClient {

	private TimedDoor timedDoor;
	
	public TimedDoorAdapter(TimedDoor timedDoor) {
		this.timedDoor = timedDoor;
	}

	public void timeOut() {
		timedDoor.doorTimeOut();
	}
}