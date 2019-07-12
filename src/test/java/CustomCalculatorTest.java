
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);

        assertThat(result,is(25));          //by LeeDongHun

        System.out.println("result :: " + result);
    }

    //빼기 테스트 작성
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);

        assertThat(result,is(13));          //by LeeDongHun

        System.out.println("result :: " + result);
    }

    //곱하기 테스트 작성
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);

        assertThat(result,is(45));          //by LeeDongHun

        System.out.println("result :: " + result);
    }

    //나누기 테스트 작성
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);

        assertThat(result,is(5));           //by LeeDongHun

        System.out.println("result :: " + result);
    }

    //0으로 나누기를 하였을 때 ArithmeticException 이 발생하는지 테스트 코드 작성
    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDivideByZero() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25, 0);
    }

    //0을 나누었을 때 결과값이 0이 되는지 테스트 코드 작성
    @Test
    public void shouldIsZeroWhenDivideIntoZero(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(0,5);

        assertThat(result,is(0));
        System.out.println("result :: " + result);
    }
}