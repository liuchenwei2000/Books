/**
 * 
 */
package TDD.mockobject.v2;

import junit.framework.TestCase;

/**
 * 存款计算器测试
 * <p>
 * 测试改变设计，采用了MockObject模式进行测试
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-21
 */
public class SavingCalculatorTest extends TestCase {

	public void testSave4OneYearFixed() {
		SavingCalculator calculator = new SavingCalculator();
		calculator.setRategen(new BankStub());
		assertTrue(105 - calculator.save4OneYearFixed(100) == 0);
	}

	/**
	 * 测试桩，是Mock Object
	 */
	private static class BankStub implements InterestRateGenerator {

		@Override
		public double generate() {
			return 0.05;
		}
	}
}

/**
 * 利率生成器
 */
interface InterestRateGenerator {

	/**
	 * 生成利率
	 */
	public double generate();
}

/**
 * 存款计算器
 */
class SavingCalculator {

	// 将利率来源封装起来
	private InterestRateGenerator rategen;

	public SavingCalculator() {
		this.rategen = new Bank();
	}

	/**
	 * 返回1年定期的本息
	 * 
	 * @param amount
	 *            本金
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