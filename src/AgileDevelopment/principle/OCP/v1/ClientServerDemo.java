/**
 * 
 */
package principle.OCP.v1;

/**
 * Client-Serverʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-28
 */
public class ClientServerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		client.connect();
		// ���Client����ϣ��ʹ������һ����ͬ�ķ��������󣬾�ֻ���޸�Client��Դ����
	}
}

/**
 * �Ȳ�����Ҳ����յ�Client��
 */
class Client {
	
	private Server server;// ֱ�������ھ����Server

	public void connect(){
		System.out.println(server);
	}
}

class Server {
	// some code...
}