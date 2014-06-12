/**
 * 
 */
package TDD.mockobject.v2;

import junit.framework.TestCase;

/**
 * ������������
 * <p>
 * ���Ըı���ƣ�������MockObjectģʽ���в���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-21
 */
public class SavingCalculatorTest extends TestCase {

	public void testSave4OneYearFixed() {
		SavingCalculator calculator = new SavingCalculator();
		calculator.setRategen(new BankStub());
		assertTrue(105 - calculator.save4OneYearFixed(100) == 0);
	}

	/**
	 * ����׮����Mock Object
	 */
	private static class BankStub implements InterestRateGenerator {

		@Override
		public double generate() {
			return 0.05;
		}
	}
}

/**
 * ����������
 */
interface InterestRateGenerator {

	/**
	 * ��������
	 */
	public double generate();
}

/**
 * ��������
 */
class SavingCalculator {

	// ��������Դ��װ����
	private InterestRateGenerator rategen;

	public SavingCalculator() {
		this.rategen = new Bank();
	}

	/**
	 * ����1�궨�ڵı�Ϣ
	 * 
	 * @param amount
	 *            ����
	 */
	public double save4OneYearFixed(double amount) {
		return amount * (1 + rategen.generate());
	}

	public void setRategen(InterestRateGenerator rategen) {
		this.rategen = rategen;
	}
}

class Bank implements InterestRateGenerator {

	private double interestRate;

	public Bank() {
		this.interestRate = 0.025;// read from bank Database
	}

	@Override
	public double generate() {
		return interestRate;
	}
}