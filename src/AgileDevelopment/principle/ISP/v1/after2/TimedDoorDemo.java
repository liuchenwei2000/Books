/**
 * 
 */
package principle.ISP.v1.after2;

/**
 * ���ж�ʱ���ܵ�����ʾ��
 * <p>
 * ������Ҫһ�����ж�ʱ���ܵ��ţ����ǻ�������Ĵ�����������µĸĶ�����ѭISP
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
 * ʹ��ί�з���ӿڣ�Ҳ���Ƕ����������ģʽ
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
 * TimedDoor�����������Ա��ڿ�����ɶ�ʱ����
 * <p>
 * ������������̫���ţ�ÿ����ҪΪTimedDoorע��һ����ʱ����ʱ��
 * ��Ҫȥ����һ���µ�����������(TimedDoorAdapter)�����ռ���ڴ沢Ӱ������ʱ��
 * ͨ��������ѡ�����������ģʽ��ֻ�е�TimedDoorAdapter������Ҫ����ת���Ǳ����
 * (���޷��޸�TimedDoor��Դ��)�����߲�ͬ��ʱ�����Ҫ��ͬ��ת��ʱ���Ż�ѡ������������ģʽ
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