/**
 * 
 */
package chapter3.item8;

import java.util.HashMap;

/**
 * ��׼HashCode����ʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-2-17
 */
public class HashCodeDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Class1��Ϊû�и�дhashCode����������HashMap��Ϊ�쳣
		 */
		HashMap<Class1,String> map1 = new HashMap<Class1,String>();
		map1.put(new Class1(1), "class1");
		System.out.println(map1.get(new Class1(1)));
		/*
		 * Class2��д��hashCode����������HashMap��������
		 */
		HashMap<Class2,String> map2 = new HashMap<Class2,String>();
		map2.put(new Class2(2), "class2");
		System.out.println(map2.get(new Class2(2)));
	}
}

/**
 * ������ڸ�дequals����֮��û�и�дhashCode����
 */
class Class1 {
	
	private int number;

	public Class1(int number) {
		super();
		this.number = number;
	}

	public boolean equals(Object obj) {
		if (this == obj)// 1
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Class1))// 2
			return false;
		Class1 other = (Class1) obj;// 3
		return other.number == this.number;// 4
	}
}

/**
 * ������ڸ�дequals����֮��ͬʱ��д��hashCode����
 */
class Class2 {

	private int number;

	public Class2(int number) {
		super();
		this.number = number;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)// 1
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Class2))// 2
			return false;
		Class2 other = (Class2) obj;// 3
		return other.number == this.number;// 4
	}
}