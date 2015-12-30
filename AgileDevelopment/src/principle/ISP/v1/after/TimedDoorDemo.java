/**
 * 
 */
package principle.ISP.v1.after;

/**
 * 具有定时功能的门演示类
 * <p>
 * 现在需要一个具有定时功能的门，于是基于最初的代码进行了如下的改动，遵循ISP
 * <p>
 * 这里有一个具有两个独立的接口，由两个独立的客户—-Timer以及Door所使用的对象(TimedDoor)。
 * 因为实现这两个接口需要操作同样的数据，所以这两个接口必须在同一个对象中实现。
 * 那么怎样才能遵循ISP呢？怎样才能分离必须在一起实现的接口呢？
 * 问题的答案基于这样一个事实：
 * 一个对象的客户不是必须通过该对象的接口去访问它，也可以通过委托或者通过该对象的基类去访问它。
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
 * 使用多重继承分离接口，也就是类的适配器模式
 */
class TimedDoor extends Door implements TimerClient {

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
