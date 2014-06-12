/**
 * 
 */
package TDD.mockobject.v3;

import junit.framework.TestCase;

/**
 * ������������
 * <p>
 * ���Bank�����ǵ������࣬�޷��޸���Դ����ʵ��InterestRateGenerator�ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-21
 */
public class SavingCalculatorTest extends TestCase {

	public void testSave4OneYearFixed() {
		SavingCalculator calculator = new SavingCalculator();
		calculator.setRategen(new BankStub());
		assertTrue(108 - calculator.save4OneYearFixed(100) == 0);
	}

	/**
	 * ����׮����Mock Object
	 */
	private static class BankStub implements InterestRateGenerator {

		@Override
		public double generate() {
			return 0.08;
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

	private InterestRateGenerator rategen;

	public SavingCalculator() {
		this.rategen = new DefaultInterestRateGenerator();
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

/**
 * ������ģʽ
 */
class DefaultInterestRateGenerator implements InterestRateGenerator {

	private Bank bank = new Bank();

	@Override
	public double generate() {
		return bank.getInterestRate();
	}
}

/**
 * ���Bank�����ǵ������࣬�޷��޸���Դ����ʵ��InterestRateGenerator�ӿ�
 */
class Bank {

	private double interestRate;

	public Bank() {
		this.interestRate = 0.025;// read from bank Database
	}

	public double getInterestRate() {
		return interestRate;
	}
}