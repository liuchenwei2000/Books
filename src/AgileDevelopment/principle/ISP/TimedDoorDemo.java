/**
 * 
 */
package principle.ISP;

/**
 * ���ж�ʱ���ܵ�����ʾ��
 * <p>
 * ��������Ĵ��룬ֻ��һ����(Door)�࣬һ����ʱ��(Timer)�࣬һ����ʱ���ͻ���(TimerClient)�ӿ�
 * ����Door��Ͷ�ʱ���ܵ������û���κι�ϵ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-31
 */
public class TimedDoorDemo {
}

/**
 * ����
 */
abstract class Door {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * ľ�ţ��ŵ�һ����ͨʵ����
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
 * ��ʱ����
 */
class Timer {

	/**
	 * ע��һ����ʱ�ͻ���
	 * 
	 * @param timerClient
	 *            ��ʱ���ͻ���
	 * @param timeout
	 *            ��ʱ����
	 */
	public void register(TimerClient timerClient, int timeout) {
		for (int i = timeout; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ��ʱʱ�䵽��֮��֪ͨ��ʱ���ͻ���ִ�в���
		timerClient.timeOut();
	}
}

/**
 * ��ʱ�ͻ���
 */
interface TimerClient {

	/**
	 * ���˶�ʱʱ�����Ĳ���
	 */
	public void timeOut();
}