/**
 * 
 */
package principle.DIP.v2;

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
 * 这个设计可以使Button控制那些愿意实现Switchable接口的任何设备
 * 这赋予了我们极大的灵活性，也意味着Button对象将能控制还没有被创造出来的对象
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
 * 可开关的 接口
 * <p>
 * 这个接口没有所有者，实际上除了Button其他类也可以使用
 * 也就是说这个接口可以放到和Button不同的库中，对Switchable的使用不必包含对Button的使用。
 */
interface Switchable {

	public void turnOn();

	public void turnOff();
}

/**
 * 灯类
 */
class Lamp implements Switchable {

	public void turnOn() {
		// do something
	}

	public void turnOff() {
		// do something
	}
}
