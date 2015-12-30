/**
 * 
 */
package chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Object的方法会影响集合类的行为演示
 *
 * @author 刘晨伟
 * 
 * 创建日期：2011-2-26
 */
public class ObjectInCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testAll();
	}

	/**
	 * equals方法主要使用在集合类的contains方法中，以判断集合中是否包含参数对象，不同的集合类有不同的实现。
	 * hashCode方法主要影响基于哈希码的集合，比如HashSet、HashMap。
	 * compareTo方法主要影响基于排序的集合，比如TreeSet、TreeMap。
	 */
	private static void testAll() {
		/*
		 * List.contains
		 * 
		 * 通过遍历整个集合，把每一个对象与参数对象进行equals比较来判断是否相等。
		 */
		List<String> list = new ArrayList<String>();
		list.add("a");
		System.out.println("List contains a? " + list.contains("a"));// true
		
		/*
		 * HashSet.contains、HashMap.containsKey
		 * 
		 * 与hash码有关的集合类都会先计算出来参数对象的哈希码，然后查看自己是否包括此哈希码；
		 * 如果不包括此哈希码，则直接返回false，认为不包括此参数对象；
		 * 如果包括此哈希码，则将该哈希码对应的对象取出来与参数对象进行equals比较来判断是否相等。
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
		 * TreeSet.contains、TreeMap.containsKey
		 * 
		 * 与排序有关的集合类都会使用Comparable接口的compareTo方法对两个对象进行相等测试，
		 * 而不会像其他集合那样使用equals方法。
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
		 * Set.add、Map.put
		 * 
		 * Set确保相等的对象最多只有一个，在使用add方法向Set中添加对象的时候，
		 * 它会根据contains方法返回的结果来决定是否要将参数对象添加进去。
		 * Map确保key中不存在相等的对象，在使用put方法向Map中添加键值对的时候，
		 * 它会根据containsKey方法返回的结果来决定是否要将参数对象添加进去。
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
	 * 这是一个不好的类，它在改写equals方法的同时没有改写hashCode。
	 * 这样就导致即使是equals的两个对象，它们的hashCode也不一样。
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
	 * 这是一个好的类，它在改写equals方法的同时改写了hashCode。
	 * 这样equals的两个对象，它们的hashCode也是不一样的。
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
	 * 这是一个不好的类，它实现的compareTo方法没有和equals方法保持一致。
	 * 这样即便两个equals相等的对象，compareTo方法却认为它们不相等。
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
	 * 这是一个好的类，它实现的compareTo方法和equals方法保持一致。
	 * 这样两个equals相等的对象，compareTo方法也认为它们相等。
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
