/**
 * 
 */
package principle.SRP;

/**
 * 调制解调器Modem示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-29
 */
public class ModemDemo {

}

/**
 * 该接口中显示出了两个职责:
 * 第一个职责是连接管理；第二个职责是数据通信
 * dial和hangup函数进行调制解调器的连接处理，而send和recv函数进行数据通信。
 * 这两个职责应该被分开吗？这依赖于应用程序变化的方式。
 * 如果应用程序的变化会影响连接函数的签名，那么这个设计就具有僵化性的臭味，
 * 因为调用send和recv的类必须要重新编译和部署。
 * 在这种情况下，这两个职责需要被分离。
 * 这样做避免了客户应用程序和这两个职责耦合在了一起。
 */
interface Modem {

	public void dial(String pno);

	public void hangup();

	public void send(char c);

	public void recv();
}

/**
 * 下面的设计将两个职责进行分离
 * <p>
 * 另一方面，如果应用程序的变化方式总是导致这两个职责同时变化，那么就不必分离它们。
 */

interface Connection {

	public void dial(String pno);

	public void hangup();
}

interface DataChannel {

	public void send(char c);

	public void recv();
}

/**
 * 把两个职责都耦合进了ModemImpl类中，这不是所希望的，但是或许是必要的。
 * 常常会有一些和硬件或者操作系统的细节有关的原因，迫使我们把不愿耦合在一起的东西耦合在了一起。
 * 然而，对于应用的其余部分来说，通过分离它们的接口我们已经解耦了概念。
 * 我们可以把ModelImpl类看作是一个杂凑物。或者一个瑕疵。
 * 然而，请注意所有的依赖关系都和它无关。
 * 谁也不需要依赖于它，除了main之外，谁也不需要知道它的存在。
 */
class ModemImpl implements Connection, DataChannel {

	public void send(char c) {
	}

	public void recv() {
	}

	public void dial(String pno) {
	}

	public void hangup() {
	}
}
