package epamass.logass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
	public class logger
	{
	private static final Logger LOGGER=LogManager.getLogger(logger.class);
	double simpleInterest(double amount,int rate,int time) {
	LOGGER.info("Calculation of SimpleInterest");
	    return (amount*rate*time)/100;
	    }
	    double compoundInterest(double amount,int rate,int time,int numOftimes) {
	    LOGGER.info("Calculation of CompoundInterest");
	        double compoundInterest = amount * Math.pow(1 + (rate /numOftimes), numOftimes * time);
	        double cinterest = compoundInterest - amount;
	        return cinterest;
	    }
	    public static void main(String args[]) {
	    logger ap=new logger();
	    LOGGER.info(ap.simpleInterest(1000, 5, 5));
	    LOGGER.info(ap.compoundInterest(1000, 4, 2, 1));
	    }
	}
