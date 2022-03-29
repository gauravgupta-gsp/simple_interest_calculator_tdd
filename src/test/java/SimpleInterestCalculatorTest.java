import static org.junit.Assert.*;

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

}
