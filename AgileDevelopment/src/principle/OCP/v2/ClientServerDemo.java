/**
 * 
 */
package principle.OCP.v2;

/**
 * Client-Server示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-28
 */
public class ClientServerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		client.connect();
		// 如果Client对象希望使用另外一个不同的服务器对象，就不需要修改Client的源码了
		client.setClientInterface(new NewServer());
	}
}

/**
 * 既开放又封闭的Client类
 */
class Client {
	
	/*
	 * Client需要实现一些功能，它可以使用ClientInterface接口去描绘那些功能
	 * ClientInterface的子类型可以以任何它们所选择的方式去实现这个接口
	 * 这样就可以通过创建ClientInterface的新的子类型的方式去扩展、更改Client中指定的行为
	 */
	private ClientInterface clientInterface;

	public void connect(){
		System.out.println(clientInterface);
	}

	public void setClientInterface(ClientInterface clientInterface) {
		this.clientInterface = clientInterface;
	}
}

/**
 * 之所以不把接口命名为AbstractServer是因为抽象类(接口)
 * 和它们的客户的关系要比和实现它们的类的关系更密切一些
 */
interface ClientInterface {
}

class Server implements ClientInterface{
	// some code...
}

class NewServer implements ClientInterface{
	// some code...
}
