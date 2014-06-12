/**
 * 
 */
package chapter08;

import java.io.EOFException;

/**
 * 异常与抽象层次的关系演示
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-12-14
 */
public class ExceptionDemo {
}

/**
 * 抛出抽象层次不一致的异常的类
 */
class Student1 {

	/**
	 * 这个方法把更底层的EOFException(文件结束)异常返给了它的调用方
	 * 它本身并不拥有这一异常，但通过把更底层的一场传递给其调用方
	 * 暴露了自身的一些实现细节(本例是获取id时会读取文件这个实现细节)
	 * 这样使得调用方代码与比Student1类层次更低的抛出EOFException的代码耦合起来了
	 * 这样既破坏了封装性，也减低了代码的智力上的可管理性。
	 */
	public String getID() throws EOFException {
		// some code
		throw new EOFException();
	}
}

/**
 * 一个在一致的抽象层次上抛出异常的类
 */
class Student2 {

	/**
	 * 抛出StudentDataUnavailable异常就充分的保持接口的抽象性
	 */
	public String getID() throws StudentDataUnavailable {
		// some code
		// 只需要在代码里将EOFException转换为一个StudentDataUnavailable异常即可
		try {
			throw new EOFException();
		} catch (Exception e) {
			throw new StudentDataUnavailable();
		}
	}
}

class StudentDataUnavailable extends Exception {

	private static final long serialVersionUID = 1L;
}