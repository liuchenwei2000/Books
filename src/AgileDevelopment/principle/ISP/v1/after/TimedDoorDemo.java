/**
 * 
 */
package principle.ISP.v1.after;

/**
 * ���ж�ʱ���ܵ�����ʾ��
 * <p>
 * ������Ҫһ�����ж�ʱ���ܵ��ţ����ǻ�������Ĵ�����������µĸĶ�����ѭISP
 * <p>
 * ������һ���������������Ľӿڣ������������Ŀͻ���-Timer�Լ�Door��ʹ�õĶ���(TimedDoor)��
 * ��Ϊʵ���������ӿ���Ҫ����ͬ�������ݣ������������ӿڱ�����ͬһ��������ʵ�֡�
 * ��ô����������ѭISP�أ��������ܷ��������һ��ʵ�ֵĽӿ��أ�
 * ����Ĵ𰸻�������һ����ʵ��
 * һ������Ŀͻ����Ǳ���ͨ���ö���Ľӿ�ȥ��������Ҳ����ͨ��ί�л���ͨ���ö���Ļ���ȥ��������
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
 * �������κ��޸�
 */
abstract class Door {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * ľ�ţ��ŵ�һ����ͨʵ����
 * <p>
 * ��ʱ��Ͳ���Ҫ�Ա�������κα䶯��
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

/**
 * ���ж�ʱ���ܵ���
 * <p>
 * �̳���Door������ʵ����TimerClient����˾��ж�ʱ������
 * <p>
 * ʹ�ö��ؼ̳з���ӿڣ�Ҳ�������������ģʽ
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