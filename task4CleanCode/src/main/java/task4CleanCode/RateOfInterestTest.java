package task4CleanCode;

import static org.junit.Assert.*;

import org.junit.Test;
public class RateOfInterestTest {

@Test
public void testCalculateSimpleInterest() {
RateOfInterest obj1=new RateOfInterest();
assertEquals("Simple Interest is :",25000.0,obj1.CalculateSimpleInterest(50000,10,5),0);
}
@Test
public void testCalculateCompoundInterest() {
RateOfInterest obj2=new RateOfInterest();
assertEquals("Compound Interest is :",30525.50000000003,obj2.CalculateCompoundInterest(50000,10,5),0);
}
}

