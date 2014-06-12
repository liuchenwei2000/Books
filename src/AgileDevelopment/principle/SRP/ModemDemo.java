/**
 * 
 */
package principle.SRP;

/**
 * ���ƽ����Modemʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-29
 */
public class ModemDemo {

}

/**
 * �ýӿ�����ʾ��������ְ��:
 * ��һ��ְ�������ӹ����ڶ���ְ��������ͨ��
 * dial��hangup�������е��ƽ���������Ӵ�����send��recv������������ͨ�š�
 * ������ְ��Ӧ�ñ��ֿ�����������Ӧ�ó���仯�ķ�ʽ��
 * ���Ӧ�ó���ı仯��Ӱ�����Ӻ�����ǩ������ô�����ƾ;��н����Եĳ�ζ��
 * ��Ϊ����send��recv�������Ҫ���±���Ͳ���
 * ����������£�������ְ����Ҫ�����롣
 * �����������˿ͻ�Ӧ�ó����������ְ���������һ��
 */
interface Modem {

	public void dial(String pno);

	public void hangup();

	public void send(char c);

	public void recv();
}

/**
 * �������ƽ�����ְ����з���
 * <p>
 * ��һ���棬���Ӧ�ó���ı仯��ʽ���ǵ���������ְ��ͬʱ�仯����ô�Ͳ��ط������ǡ�
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
 * ������ְ����Ͻ���ModemImpl���У��ⲻ����ϣ���ģ����ǻ����Ǳ�Ҫ�ġ�
 * ��������һЩ��Ӳ�����߲���ϵͳ��ϸ���йص�ԭ����ʹ���ǰѲ�Ը�����һ��Ķ����������һ��
 * Ȼ��������Ӧ�õ����ಿ����˵��ͨ���������ǵĽӿ������Ѿ������˸��
 * ���ǿ��԰�ModelImpl�࿴����һ���Ӵ������һ��覴á�
 * Ȼ������ע�����е�������ϵ�������޹ء�
 * ˭Ҳ����Ҫ��������������main֮�⣬˭Ҳ����Ҫ֪�����Ĵ��ڡ�
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