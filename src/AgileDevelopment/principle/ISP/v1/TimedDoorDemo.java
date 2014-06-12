/**
 * 
 */
package principle.ISP.v1;

/**
 * ���ж�ʱ���ܵ�����ʾ��
 * <p>
 * ������Ҫһ�����ж�ʱ���ܵ��ţ����ǻ�������Ĵ�����������µĸĶ�������ѭISP
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-31
 */
public class TimedDoorDemo {
}

/**
 * ����
 * <p>
 * Ϊ�˸�һ����������ô����ӿ�������һ��������
 * ���̳���TimerClient��timeOut()����
 */
abstract class Door implements TimerClient {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * ľ�ţ��ŵ�һ����ͨʵ����
 * <p>
 * ��Ȼ���಻��Ҫ�Ķ�ʱ���ܣ�����Door������һ���·���������Ҳ����Ҫ�ı���ʵ�ֻ�����·���
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
	 * ��ʹľ�Ų���Ҫ��ҲҪʵ��
	 */
	public void timeOut() {
		// do nothing
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

/**
 * ���ж�ʱ���ܵ���
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