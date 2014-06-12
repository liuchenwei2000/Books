/**
 * 
 */
package chapter2.item5;

import java.util.EmptyStackException;

/**
 * ������������(Obsolete Reference)��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-12-21
 */
public class EliminateObsoleteReferenceDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack s = new Stack(0);
		for (int i = 0; i < 10; i++) {
			s.push(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(s.pop1());
		}
	}
}

/**
 * ����һ���Զ����ջ
 */
class Stack {
	
	private Object[] elements;
	private int size = 0;

	public Stack(int initialCapacity) {
		this.elements = new Object[initialCapacity];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	/**
	 * ������������ڴ�й©
	 */
	public Object pop1() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		/*
		 * ������������󵯳�ջ�����ǲ�δ���ջ�ڲ��Ըö���Ĺ������ã���elements[size]��Ȼָ��ö���
		 * �����EliminateObsoleteReferenceDemo.main()�ķ�ʽʹ��ջ���ͻ����ڴ�й©
		 */
		return  elements[--size];
	}
	
	/**
	 * ��������������ڴ�й©
	 */
	public Object pop2() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		/*
		 * ���ﲻ���������󵯳�ջ�����������ջ�ڲ��Ըö�������ã���elements[size]Ϊnull
		 */
		elements[size] = null;
		return result;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			Object[] oldElements = elements;
			elements = new Object[2 * elements.length + 1];
			System.arraycopy(oldElements, 0, elements, 0, size);
		}
	}
}