/**
 * 
 */
package chapter3.item8;

import java.util.Arrays;

/**
 * ����hash code��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2011-2-18
 */
public class CachedHashCodeDemo {
}

/**
 * ���һ�����Ƿǿɱ�ģ����Ҽ���ɢ����Ĵ��۱Ƚϴ�
 * ��ô��Ӧ�ÿ��ǰ�ɢ���뻺���ڶ����ڲ���������ÿ�������ʱ�����¼���ɢ���롣
 * ����������͵Ĵ�������󶼻ᱻ����ɢ�м�����ôӦ����ʵ��������ʱ��ͼ���ɢ���롣
 * ����Ļ�������ѡ������ʼ��ɢ���룬һֱ��hashCode��һ�α����õ�ʱ��ų�ʼ����
 */
class Immutable {
	
	private volatile int hashCode = 0; 

	private int[] array = new int[10000];

	public int hashCode() {
		if (hashCode == 0) {
			final int prime = 31;
			int result = 1;
			hashCode = prime * result + Arrays.hashCode(array);
		}
		return hashCode;
	}
}