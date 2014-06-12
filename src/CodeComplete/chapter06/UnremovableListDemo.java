/**
 * 
 */
package chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * �����Ƴ����б���ʾ
 * <p>
 * һ��Ҫ�������ʵ�ֵĳ�����ʲô
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-11-13
 */
public class UnremovableListDemo {
}

/**
 * ����ɾ��Ԫ�ص��б�
 * <p>
 * ����б�Ĺ����ӿ�Ӧ���� add(T),get(int),size() ���㹻��
 */
class UnremovableList<T> {

	// �ڲ�ʹ��Listʵ��
	private List<T> list = new ArrayList<T>();

	public void add(T element) {
		list.add(element);
	}
	
	/**
	 * ��������Ͳ�Ӧ�ó����ڹ����ӿ���
	 * ����List�����๫���ӿڶ�Ӧ�ñ���������
	 * ��ΪUnremovableListֻ��Ҫ���е������͹���
	 */
	public void remove(T element) {
		list.remove(element);
	}

	public T get(int index) {
		return list.get(index);
	}

	public int size() {
		return list.size();
	}
}