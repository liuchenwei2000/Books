/**
 * 
 */
package principle.ISP.v2;

/**
 * ���ж�ʱ���ܵ�����ʾ��
 * <p>
 * ���ڶ�ʱ����Ҫ��¼ÿ�ζ�ʱ����Ϣ���Ա��ڶ�ʱ����֮�����ʶ��
 * Ҳ����˵��ʱ��ϵͳ��Ҫ�����Լ��Ľӿ�
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
abstract class Door implements TimerClient {

	public abstract void lock();

	public abstract void unlock();

	public abstract boolean isLocked();
}

/**
 * ľ�ţ��ŵ�һ����ͨʵ����
 * <p>
 * ���ڶ�ʱ��ϵͳ�Ľӿڱ��������Ҳ���ò������޸�
 * �����������Ӱ�쵽Door��������������пͻ��������ǽ����Ժ�ճ���Ե�
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
	 * ��ʹľ�Ų���Ҫ��ҲҪ�޸ı�����
	 */
	public void timeOut(int timeOutID) {
	}
}

/**
 * ��ʱ����
 * <p>
 * �ı��˽ӿڣ�������һ������
 */
class Timer {

	/**
	 * ע��һ����ʱ�ͻ���
	 * 
	 * @param timerClient
	 *            ��ʱ���ͻ���
	 * @param timeout
	 *            ��ʱ����
	 * @param timeOutID 
	 *            ��ʱID
	 */
	public void register(TimerClient timerClient, int timeout, int timeOutID) {
		for (int i = timeout; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ��ʱʱ�䵽��֮��֪ͨ��ʱ���ͻ���ִ�в���
		timerClient.timeOut(timeOutID);
	}
}

/**
 * ��ʱ�ͻ���
 * <p>
 * �ı��˽ӿڣ�������һ������
 */
interface TimerClient {

	/**
	 * ���˶�ʱʱ�����Ĳ���
	 * 
	 * @param timeOutID
	 *            ��ʱID
	 */
	public void timeOut(int timeOutID);
}

/**
 * ���ж�ʱ���ܵ���
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