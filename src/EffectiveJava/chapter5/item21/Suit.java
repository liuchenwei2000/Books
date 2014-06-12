/**
 * 
 */
package chapter5.item21;

/**
 * �˿��ƻ�ɫö��
 * <p>
 * ʹ�����Ͱ�ȫö��ģʽʵ�֡�
 * <p>
 * ��Ϊ�ͻ�û�а취���������Ķ���Ҳ�޷���չ����࣬
 * ���ԣ�������Щ���еľ�̬final��������Suit����֮�⣬�������б�Ķ�����ڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-3-14
 */
public class Suit {

	public static final Suit CLUBS = new Suit("clubs");// ����
	public static final Suit DIAMONDS = new Suit("diamonds");// ����
	public static final Suit HEARTS = new Suit("hearts");// ����
	public static final Suit SPADES = new Suit("spades");// ÷��

	private final String name;

	private Suit(String name) {
		this.name = name;
	}

	/**
	 * ��Ϊ���Ͱ�ȫö��������ȫ�����ϵ��࣬���Կ�������ǰ���ܵ�������д
	 * toString�������Ӷ��������е�ֵ��ת��Ϊ�ɴ�ӡ���ַ�����
	 * ע�⣬ֻ��toString�����õ����ַ������֣�equals�Ƚϲ�����û���õ�����
	 * ��Ϊ��Object�̳е�����equalsʵ��ִֻ�����ñȽϡ�
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}
}