/**
 * 
 */
package principle.OCP.v2;

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
		// ���Client����ϣ��ʹ������һ����ͬ�ķ��������󣬾Ͳ���Ҫ�޸�Client��Դ����
		client.setClientInterface(new NewServer());
	}
}

/**
 * �ȿ����ַ�յ�Client��
 */
class Client {
	
	/*
	 * Client��Ҫʵ��һЩ���ܣ�������ʹ��ClientInterface�ӿ�ȥ�����Щ����
	 * ClientInterface�������Ϳ������κ�������ѡ��ķ�ʽȥʵ������ӿ�
	 * �����Ϳ���ͨ������ClientInterface���µ������͵ķ�ʽȥ��չ������Client��ָ������Ϊ
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
 * ֮���Բ��ѽӿ�����ΪAbstractServer����Ϊ������(�ӿ�)
 * �����ǵĿͻ��Ĺ�ϵҪ�Ⱥ�ʵ�����ǵ���Ĺ�ϵ������һЩ
 */
interface ClientInterface {
}

class Server implements ClientInterface{
	// some code...
}

class NewServer implements ClientInterface{
	// some code...
}