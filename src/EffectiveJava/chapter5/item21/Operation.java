/**
 * 
 */
package chapter5.item21;

/**
 * �������ö��
 * <p>
 * ���һ�����Ͱ�ȫö������һЩ���������ڲ�ͬ�ĳ�������Ϊ�кܴ�ı仯��
 * ��ôӦ��Ϊÿһ��������һ��������˽��������������ڲ��ࡣ
 * ��ʹ��ÿ����������ÿ�������ķ��������Լ���ʵ�֣�����Ҳ�����Զ�������ȷ�ķ���ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-3-14
 */
public abstract class Operation {

	private final String name;

	Operation(String name) {
		this.name = name;
	}

	/**
	 * ����������
	 */
	abstract double eval(double x, double y);

	public String toString() {
		return name;
	}

	/**
	 * �ӷ�
	 */
	public static final Operation PLUS = new Operation("+") {

		@Override
		double eval(double x, double y) {
			return x + y;
		}
	};

	/**
	 * ����
	 */
	public static final Operation MINUS = new Operation("-") {

		@Override
		double eval(double x, double y) {
			return x - y;
		}
	};

	/**
	 * �˷�
	 */
	public static final Operation TIMES = new Operation("*") {

		@Override
		double eval(double x, double y) {
			return x * y;
		}
	};

	/**
	 * ����
	 */
	public static final Operation DIVIDE = new Operation("/") {

		@Override
		double eval(double x, double y) {
			return x / y;
		}
	};
}