 package calculator;
 import org.junit.Rule;
 import org.junit.Test;
 import org.junit.rules.ExpectedException;

 import static org.hamcrest.CoreMatchers.is;

 import static org.junit.Assert.assertThat;

 public class StringCalculatorShould {

 	@Test
 	public void sumsEmptyStringTo0() {
 		assertThat(StringCalculator.sum(""), is(0));
 	}

 }