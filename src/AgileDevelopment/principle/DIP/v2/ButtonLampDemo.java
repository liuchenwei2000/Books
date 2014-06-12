/**
 * 
 */
package principle.DIP.v2;

/**
 * ��ť���Ƶ���ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-31
 */
public class ButtonLampDemo {
}

/**
 * ��ť��
 * <p>
 * �����ƿ���ʹButton������ЩԸ��ʵ��Switchable�ӿڵ��κ��豸
 * �⸳�������Ǽ��������ԣ�Ҳ��ζ��Button�����ܿ��ƻ�û�б���������Ķ���
 */
class Button {

	private Switchable switchable;

	public void press() {
		if (isOn()) {
			switchable.turnOff();
		} else {
			switchable.turnOn();
		}
	}

	private boolean isOn() {
		// some business logic
		return true;
	}

	public Switchable getSwitchable() {
		return switchable;
	}

	public void setSwitchable(Switchable switchable) {
		this.switchable = switchable;
	}
}

/**
 * �ɿ��ص� �ӿ�
 * <p>
 * ����ӿ�û�������ߣ�ʵ���ϳ���Button������Ҳ����ʹ��
 * Ҳ����˵����ӿڿ��Էŵ���Button��ͬ�Ŀ��У���Switchable��ʹ�ò��ذ�����Button��ʹ�á�
 */
interface Switchable {

	public void turnOn();

	public void turnOff();
}

/**
 * ����
 */
class Lamp implements Switchable {

	public void turnOn() {
		// do something
	}

	public void turnOff() {
		// do something
	}
}