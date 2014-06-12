/**
 * 
 */
package principle.DIP.v1;

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
 * ������Υ����DIP���߲����û�к͵Ͳ�ʵ�ַ��롣
 */
class Button {

	// ֱ�������ڵͲ��Lamp��
	private Lamp lamp;

	public void press() {
		if (isOn()) {
			lamp.turnOff();
		} else {
			lamp.turnOn();
		}
	}

	private boolean isOn() {
		// some business logic
		return true;
	}

	public Lamp getLamp() {
		return lamp;
	}

	public void setLamp(Lamp lamp) {
		this.lamp = lamp;
	}
}

/**
 * ����
 */
class Lamp {

	public void turnOn() {
		// do something
	}

	public void turnOff() {
		// do something
	}
}