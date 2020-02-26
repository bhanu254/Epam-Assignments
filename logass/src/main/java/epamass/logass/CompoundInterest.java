package epamass.logass;
import java.lang.Math;
public class CompoundInterest extends Interest{
	@Override
	public
	double CalculateInterest(double principal, double rate, double time) {
		return principal * Math.pow(rate + 1, time) - principal;
	}
	
}
