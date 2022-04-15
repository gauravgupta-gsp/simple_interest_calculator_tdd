



import org.junit.Assert;
import org.junit.Test;

import com.gaurav.tdd.SimpleInterestCalculator;



public class SimpleInterestCalculatorTest {

	
	@Test
	public void calculate_shouldReturnSimpleInterestForGivenAmountAndTenure() {
		
		int principalAmount = 5000;		
		int tenure = 365;
		double expectedOutput = 265;
		
		double actualInterest = SimpleInterestCalculator.calculate(principalAmount, tenure);
				
		Assert.assertEquals(expectedOutput, actualInterest, 0.1);
	}
	
	@Test
	public void calculate_interestShouldBe5Point2IncaseDaysAreLessThan365Days(){
		//Arrange
		int principalAmount =6100;
		int tenureInDays = 350;
		double expectedInterestAmount =304.16;
		
		// Act
		double actualInterest = SimpleInterestCalculator.calculate(principalAmount, tenureInDays);
		// Assert
		Assert.assertEquals(expectedInterestAmount, actualInterest,1);	
	}
	
	@Test
	public void calculate_seniorCitizenTenureLessThanYear(){
		//Arrange
		int principalAmount =6100;
		int tenureInDays = 350;
		double expectedInterestAmount =310.01;
		
		// Act
		double actualInterest = SimpleInterestCalculator.calculate(principalAmount, tenureInDays, 61);
		// Assert
		Assert.assertEquals(expectedInterestAmount, actualInterest,1);	
	}
	
	@Test
	public void calculate_SimpleInterestForSeniorCitizenWhenTenureIsMoreThanYear(){
		//Arrange
		int principalAmount =6100;
		int tenureInDays = 370;
		double expectedInterestAmount =333.91;
		
		// Act
		double actualInterest = SimpleInterestCalculator.calculate(principalAmount, tenureInDays, 61);
		// Assert
		Assert.assertEquals(expectedInterestAmount, actualInterest,1);	
	}
	
	@Test (expected = RuntimeException.class)
	public void calculate_shouldThrowExceptionIfAmountGreaterFiveLacAndTenureLessThanTwoYears() {
		int principalAmount =500001;
		int tenureInDays = 370;
		double expectedInterestAmount =333.91;
		
		// Act
		double actualInterest = SimpleInterestCalculator.calculate(principalAmount, tenureInDays, 61);
		
	}

}
