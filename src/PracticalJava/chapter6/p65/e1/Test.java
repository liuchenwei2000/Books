/**
 * 
 */
package chapter6.p65.e1;

/**
 * 客户端测试类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-11-18
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableCircle ic = createCircle(3);
		// 下面的语句会有编译错
		// ic.setRedius(5);
		/*
		 * 由于immutable interface仅仅暴露了底层class的非可变函数，所以
		 * 通过这个interface访问的objects能保持不变性。
		 * 但是，用户仍然可以使用简单的转型(cast)动作轻易消除不变性，如下：
		 */
		((MutableCircle) ic).setRedius(5);
	}
	
	public static ImmutableCircle createCircle(double r){
		return new MutableCircle(r);
	}
}
