/**
 * 
 */
package chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Object�ķ�����Ӱ�켯�������Ϊ��ʾ
 *
 * @author ����ΰ
 * 
 * �������ڣ�2011-2-26
 */
public class ObjectInCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testAll();
	}

	/**
	 * equals������Ҫʹ���ڼ������contains�����У����жϼ������Ƿ�����������󣬲�ͬ�ļ������в�ͬ��ʵ�֡�
	 * hashCode������ҪӰ����ڹ�ϣ��ļ��ϣ�����HashSet��HashMap��
	 * compareTo������ҪӰ���������ļ��ϣ�����TreeSet��TreeMap��
	 */
	private static void testAll() {
		/*
		 * List.contains
		 * 
		 * ͨ�������������ϣ���ÿһ������������������equals�Ƚ����ж��Ƿ���ȡ�
		 */
		List<String> list = new ArrayList<String>();
		list.add("a");
		System.out.println("List contains a? " + list.contains("a"));// true
		
		/*
		 * HashSet.contains��HashMap.containsKey
		 * 
		 * ��hash���йصļ����඼���ȼ��������������Ĺ�ϣ�룬Ȼ��鿴�Լ��Ƿ�����˹�ϣ�룻
		 * ����������˹�ϣ�룬��ֱ�ӷ���false����Ϊ�������˲�������
		 * ��������˹�ϣ�룬�򽫸ù�ϣ���Ӧ�Ķ���ȡ����������������equals�Ƚ����ж��Ƿ���ȡ�
		 */
		HashSet<BadHashCodeObject> hashSet = new HashSet<BadHashCodeObject>();
		hashSet.add(new BadHashCodeObject(0));
		System.out.println("HashSet contains BadHashCodeObject? "
				+ hashSet.contains(new BadHashCodeObject(0)));// false
		
		HashSet<GoodHashCodeObject> hashSet2 = new HashSet<GoodHashCodeObject>();
		hashSet2.add(new GoodHashCodeObject(0));
		System.out.println("HashSet contains GoodHashCodeObject? "
				+ hashSet2.contains(new GoodHashCodeObject(0)));// true
		/*
		 * TreeSet.contains��TreeMap.containsKey
		 * 
		 * �������йصļ����඼��ʹ��Comparable�ӿڵ�compareTo�������������������Ȳ��ԣ�
		 * ��������������������ʹ��equals������
		 */
		TreeSet<BadComparableObject> treeSet = new TreeSet<BadComparableObject>();
		treeSet.add(new BadComparableObject(0));
		System.out.println("TreeSet contains BadComparableObject? "
				+ treeSet.contains(new BadComparableObject(0)));// false
		
		TreeSet<GoodComparableObject> treeSet2 = new TreeSet<GoodComparableObject>();
		treeSet2.add(new GoodComparableObject(0));
		System.out.println("TreeSet contains GoodComparableObject? "
				+ treeSet2.contains(new GoodComparableObject(0)));// true
		/*
		 * Set.add��Map.put
		 * 
		 * Setȷ����ȵĶ������ֻ��һ������ʹ��add������Set����Ӷ����ʱ��
		 * �������contains�������صĽ���������Ƿ�Ҫ������������ӽ�ȥ��
		 * Mapȷ��key�в�������ȵĶ�����ʹ��put������Map����Ӽ�ֵ�Ե�ʱ��
		 * �������containsKey�������صĽ���������Ƿ�Ҫ������������ӽ�ȥ��
		 */
		HashSet<BadHashCodeObject> hashSet3 = new HashSet<BadHashCodeObject>();
		hashSet3.add(new BadHashCodeObject(0));
		hashSet3.add(new BadHashCodeObject(0));
		System.out.println("HashSet size =  " + hashSet3.size());// 2
		
		HashSet<GoodHashCodeObject> hashSet4 = new HashSet<GoodHashCodeObject>();
		hashSet4.add(new GoodHashCodeObject(0));
		hashSet4.add(new GoodHashCodeObject(0));
		System.out.println("HashSet size =  " + hashSet4.size());// 1
		
		TreeSet<BadComparableObject> treeSet3 = new TreeSet<BadComparableObject>();
		treeSet3.add(new BadComparableObject(0));
		treeSet3.add(new BadComparableObject(0));
		System.out.println("TreeSet size =  " + treeSet3.size());// 2
		
		TreeSet<GoodComparableObject> treeSet4 = new TreeSet<GoodComparableObject>();
		treeSet4.add(new GoodComparableObject(0));
		treeSet4.add(new GoodComparableObject(0));
		System.out.println("TreeSet size =  " + treeSet4.size());// 1
	}
	
	/**
	 * ����һ�����õ��࣬���ڸ�дequals������ͬʱû�и�дhashCode��
	 * �����͵��¼�ʹ��equals�������������ǵ�hashCodeҲ��һ����
	 */
	private static class BadHashCodeObject {
		
		private int n;

		public BadHashCodeObject(int n) {
			this.n = n;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BadHashCodeObject other = (BadHashCodeObject) obj;
			if (n != other.n)
				return false;
			return true;
		}
	}
	
	/**
	 * ����һ���õ��࣬���ڸ�дequals������ͬʱ��д��hashCode��
	 * ����equals�������������ǵ�hashCodeҲ�ǲ�һ���ġ�
	 */
	private static class GoodHashCodeObject {
		
		private int n;

		public GoodHashCodeObject(int n) {
			this.n = n;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + n;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GoodHashCodeObject other = (GoodHashCodeObject) obj;
			if (n != other.n)
				return false;
			return true;
		}
	}
	
	/**
	 * ����һ�����õ��࣬��ʵ�ֵ�compareTo����û�к�equals��������һ�¡�
	 * ������������equals��ȵĶ���compareTo����ȴ��Ϊ���ǲ���ȡ�
	 */
	private static class BadComparableObject implements
			Comparable<BadComparableObject> {

		private int n;

		public BadComparableObject(int n) {
			this.n = n;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + n;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BadComparableObject other = (BadComparableObject) obj;
			if (n != other.n)
				return false;
			return true;
		}

		@Override
		public int compareTo(BadComparableObject o) {
			int result = this.n - o.n;
			return result == 0 ? -1 : result;
		}
	}

	/**
	 * ����һ���õ��࣬��ʵ�ֵ�compareTo������equals��������һ�¡�
	 * ��������equals��ȵĶ���compareTo����Ҳ��Ϊ������ȡ�
	 */
	private static class GoodComparableObject implements
			Comparable<GoodComparableObject> {

		private int n;

		public GoodComparableObject(int n) {
			this.n = n;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + n;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GoodComparableObject other = (GoodComparableObject) obj;
			if (n != other.n)
				return false;
			return true;
		}

		@Override
		public int compareTo(GoodComparableObject o) {
			return this.n - o.n;
		}
	}
}