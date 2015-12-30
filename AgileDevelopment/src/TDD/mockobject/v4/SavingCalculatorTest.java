/**
 * 
 */
package TDD.mockobject.v4;

import junit.framework.TestCase;

/**
 * 存款计算器测试
 * <p>
 * 后来发现直接将利率参数化，由外部注入更方便
 * 这样一来，SavingCalculator就和Bank解耦了，也更容易测试
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-21
 */
public class SavingCalculatorTest extends TestCase {
	
	public void testSave4OneYearFixed() {
		SavingCalculator calculator = new SavingCalculator(0.05);
		assertTrue(105 - calculator.save4OneYearFixed(100) == 0);
	}
}

/**
 * 存款计算器
 */
class SavingCalculator {
	
	private double rate;// 利率
	
	public SavingCalculator(double rate) {
		this.rate = rate;
	}

	/**
	 * 返回1年定期的本息
	 * 
	 * @param amount
	 *            本金
	 */
	public double save4OneYearFixed(double amount){
		return amount * (1 + rate);
	}
}

class Bank {
	
	private double interestRate;
	
	public Bank(){
		this.interestRate = 0.025;// read from bank Database
	}

	public double getInterestRate() {
		return interestRate;
	}
}
