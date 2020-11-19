import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculate {
	
	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}
	
	public void emptyStringReturnsZero() throws Exception {
		assertEquals(calculator.calculate(""),0);
	}
	
	public void singleValueIsSame() throws Exception {
		assertEquals(calculator.calculate("1"),1);
	}
	
	public void twoNumbersCommaDelimitedReturnsSum() throws Exception {
		assertEquals(calculator.calculate("1,2"),3);
	}
	
	public void twoNumbersNewlineDelimitedReturnsSum() throws Exception {
		assertEquals(calculator.calculate("1\n2"),3);
	}
	
	public void threeNumbersDelimitedEitherWayReturnsSum() throws Exception {
		assertEquals(calculator.calculate("1,2,3"),6);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeInputReturnsException() throws Exception {
		calculator.calculate("-1");
	}
	
	public void numbersGreaterThan1000() throws Exception {
		assertEquals(calculator.calculate("10,20,1001"),30);
		
	}
	
	
}
