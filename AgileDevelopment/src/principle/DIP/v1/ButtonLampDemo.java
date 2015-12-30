/**
 * 
 */
package principle.DIP.v1;

/**
 * 按钮控制灯演示类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-31
 */
public class ButtonLampDemo {
}

/**
 * 按钮类
 * <p>
 * 这个设计违反了DIP，高层策略没有和低层实现分离。
 */
class Button {

	// 直接依赖于低层的Lamp类
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
 * 灯类
 */
class Lamp {

	public void turnOn() {
		// do something
	}

	public void turnOff() {
		// do something
	}
}
