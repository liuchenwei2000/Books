/**
 * 
 */
package TDD.mockobject.v3;

import junit.framework.TestCase;

/**
 * 存款计算器测试
 * <p>
 * 如果Bank对象是第三方类，无法修改其源码以实现InterestRateGenerator接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-21
 */
public class SavingCalculatorTest extends TestCase {

	public void testSave4OneYearFixed() {
		SavingCalculator calculator = new SavingCalculator();
		calculator.setRategen(new BankStub());
		assertTrue(108 - calculator.save4OneYearFixed(100) == 0);
	}

	/**
	 * 测试桩，是Mock Object
	 */
	private static class BankStub implements InterestRateGenerator {

		@Override
		public double generate() {
			return 0.08;
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

	private InterestRateGenerator rategen;

	public SavingCalculator() {
		this.rategen = new DefaultInterestRateGenerator();
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

/**
 * 适配器模式
 */
class DefaultInterestRateGenerator implements InterestRateGenerator {

	private Bank bank = new Bank();

	@Override
	public double generate() {
		return bank.getInterestRate();
	}
}

/**
 * 如果Bank对象是第三方类，无法修改其源码以实现InterestRateGenerator接口
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
