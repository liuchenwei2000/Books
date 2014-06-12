/**
 * 
 */
package TDD.mockobject.v4;

import junit.framework.TestCase;

/**
 * ������������
 * <p>
 * ��������ֱ�ӽ����ʲ����������ⲿע�������
 * ����һ����SavingCalculator�ͺ�Bank�����ˣ�Ҳ�����ײ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-21
 */
public class SavingCalculatorTest extends TestCase {
	
	public void testSave4OneYearFixed() {
		SavingCalculator calculator = new SavingCalculator(0.05);
		assertTrue(105 - calculator.save4OneYearFixed(100) == 0);
	}
}

/**
 * ��������
 */
class SavingCalculator {
	
	private double rate;// ����
	
	public SavingCalculator(double rate) {
		this.rate = rate;
	}

	/**
	 * ����1�궨�ڵı�Ϣ
	 * 
	 * @param amount
	 *            ����
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