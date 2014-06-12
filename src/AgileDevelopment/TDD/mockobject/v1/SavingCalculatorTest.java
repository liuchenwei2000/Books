/**
 * 
 */
package TDD.mockobject.v1;

import junit.framework.TestCase;

/**
 * 存款计算器测试
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-21
 */
public class SavingCalculatorTest extends TestCase {

	public void testSave4OneYearFixed() {
		// assert what?
		// 因为不知道利率，所以无法进行测试
	}
}

/**
 * 存款计算器
 */
class SavingCalculator {

	private Bank bank;

	public SavingCalculator() {
		this.bank = new Bank();
	}

	/**
	 * 返回1年定期的本息
	 * 
	 * @param amount
	 *            本金
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