/**
 * 
 */
package principle.OCP.v1;

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
		// 如果Client对象希望使用另外一个不同的服务器对象，就只能修改Client的源码了
	}
}

/**
 * 既不开放也不封闭的Client类
 */
class Client {
	
	private Server server;// 直接依赖于具体的Server

	public void connect(){
		System.out.println(server);
	}
}

class Server {
	// some code...
}