package task4CleanCode;
	import java.lang.Math;
	public class RateOfInterest
	{
	public double CalculateSimpleInterest(double principalamount,double rate_of_interest,double time_period)
	{
	return (principalamount*rate_of_interest*time_period)/100;
	}
	public double CalculateCompoundInterest(double principalamount,double rate_of_interest,double compoundtime_period)
	{
	double yy=principalamount*Math.pow(1.0+rate_of_interest/100.0,compoundtime_period)-principalamount;
	return yy;
	}
}
