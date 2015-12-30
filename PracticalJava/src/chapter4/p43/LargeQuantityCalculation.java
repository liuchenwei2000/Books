/**
 * 
 */
package chapter4.p43;

/**
 * 懒加载同样可以运用于数字计算。
 * <p>
 * 某些计算格外花费时间，通过懒加载的巧妙运用，可以显著加速程序的执行速度。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2012-12-6
 */
public class LargeQuantityCalculation {
	
	public static void main(String[] args) {
		Matrix2D mx1 = new Matrix2D(100, 100);
		Matrix2D mx2 = new Matrix2D(100, 100);
		mx1.add(mx2);
		// 这种场景下，传统矩阵为获取一个元素的值而计算了所有的元素。
		mx1.getElementAt(86, 35);
	}
}

/**
 * 传统矩阵
 */
class Matrix2D {

	private int[][] matrix;

	public Matrix2D(int rows, int cols) {
		this.matrix = new int[rows][cols];
	}

	/**
	 * 传统矩阵加法实现。
	 */
	public void add(Matrix2D other) {
		// 为矩阵的每一个元素都进行加法运算，大量的计算
		for (int i = 0; i < other.getRows(); i++) {
			for (int j = 0; j < other.getCols(); j++) {
				matrix[i][j] += other.getElementAt(i, j);
			}
		}
	}

	public int getRows() {
		return matrix.length;
	}

	public int getCols() {
		return matrix[0].length;
	}

	public int getElementAt(int row, int col) {
		return this.matrix[row][col];
	}
}

/**
 * 懒加载矩阵
 */
class LazyMatrix2D {

	private int[][] matrix;
	
	private LazyMatrix2D otherMatrix;// 执行加法的目标矩阵

	public LazyMatrix2D(int rows, int cols) {
		this.matrix = new int[rows][cols];
	}

	/**
	 * 懒加载的矩阵加法实现。
	 */
	public void add(LazyMatrix2D other) {
		// 只记录目标矩阵，速度非常快。
		this.otherMatrix = other;
	}

	public int getRows() {
		return matrix.length;
	}

	public int getCols() {
		return matrix[0].length;
	}

	public int getElementAt(int row, int col) {
		if (otherMatrix == null) {// 没有执行加法操作
			return this.matrix[row][col];
		}
		// 在这个地方为置顶元素执行加法运算，计算量小多了
		return this.matrix[row][col] + otherMatrix.getElementAt(row, col);
	}
}
