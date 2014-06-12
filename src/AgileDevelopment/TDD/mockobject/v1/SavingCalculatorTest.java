/**
 * 
 */
package TDD.mockobject.v1;

import junit.framework.TestCase;

/**
 * ������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-21
 */
public class SavingCalculatorTest extends TestCase {

	public void testSave4OneYearFixed() {
		// assert what?
		// ��Ϊ��֪�����ʣ������޷����в���
	}
}

/**
 * ��������
 */
class SavingCalculator {

	private Bank bank;

	public SavingCalculator() {
		this.bank = new Bank();
	}

	/**
	 * ����1�궨�ڵı�Ϣ
	 * 
	 * @param amount
	 *            ����
	 */
	public double save4OneYearFixed(double amount) {
		return amount * (1 + bank.getInterestRate());
	}
}

class Bank {

	private double interestRate;

	public Bank() {
		this.interestRate = 0.025;// read from bank Database
	}

	public double getInterestRate() {
		return interestRate;
	}
}