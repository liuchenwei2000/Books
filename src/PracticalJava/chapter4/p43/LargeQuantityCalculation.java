/**
 * 
 */
package chapter4.p43;

/**
 * ������ͬ���������������ּ��㡣
 * <p>
 * ĳЩ������⻨��ʱ�䣬ͨ�������ص��������ã������������ٳ����ִ���ٶȡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2012-12-6
 */
public class LargeQuantityCalculation {
	
	public static void main(String[] args) {
		Matrix2D mx1 = new Matrix2D(100, 100);
		Matrix2D mx2 = new Matrix2D(100, 100);
		mx1.add(mx2);
		// ���ֳ����£���ͳ����Ϊ��ȡһ��Ԫ�ص�ֵ�����������е�Ԫ�ء�
		mx1.getElementAt(86, 35);
	}
}

/**
 * ��ͳ����
 */
class Matrix2D {

	private int[][] matrix;

	public Matrix2D(int rows, int cols) {
		this.matrix = new int[rows][cols];
	}

	/**
	 * ��ͳ����ӷ�ʵ�֡�
	 */
	public void add(Matrix2D other) {
		// Ϊ�����ÿһ��Ԫ�ض����мӷ����㣬�����ļ���
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
 * �����ؾ���
 */
class LazyMatrix2D {

	private int[][] matrix;
	
	private LazyMatrix2D otherMatrix;// ִ�мӷ���Ŀ�����

	public LazyMatrix2D(int rows, int cols) {
		this.matrix = new int[rows][cols];
	}

	/**
	 * �����صľ���ӷ�ʵ�֡�
	 */
	public void add(LazyMatrix2D other) {
		// ֻ��¼Ŀ������ٶȷǳ��졣
		this.otherMatrix = other;
	}

	public int getRows() {
		return matrix.length;
	}

	public int getCols() {
		return matrix[0].length;
	}

	public int getElementAt(int row, int col) {
		if (otherMatrix == null) {// û��ִ�мӷ�����
			return this.matrix[row][col];
		}
		// ������ط�Ϊ�ö�Ԫ��ִ�мӷ����㣬������С����
		return this.matrix[row][col] + otherMatrix.getElementAt(row, col);
	}
}