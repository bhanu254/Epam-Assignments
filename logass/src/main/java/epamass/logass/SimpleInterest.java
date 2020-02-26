package epamass.logass;

public class SimpleInterest extends Interest{

	@Override
	public
	double CalculateInterest(double principal, double rate, double time) {
		return principal * rate * time;
	}
	
}
