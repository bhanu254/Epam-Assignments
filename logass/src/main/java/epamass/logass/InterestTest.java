package epamass.logass;
import epamass.logass.CompoundInterest;
import epamass.logass.SimpleInterest;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class InterestTest {
	private static final Logger logger = LogManager.getLogger(ConstructionCostTest.class);
	@SuppressWarnings("deprecation")
	public static void main(String[] args) { //testCalculateInterest() {
		logger.entry();
		logger.trace("Testing");
		logger.debug("Testing Interest modules");
		SimpleInterest SI = new SimpleInterest();
		CompoundInterest CI = new CompoundInterest();
		logger.info(SI.CalculateInterest(2000, 4, 3));
		logger.info(CI.CalculateInterest(635, 2, 4));
		logger.exit();
	}
}