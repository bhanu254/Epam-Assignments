package task4CleanCode;
import static org.junit.Assert.*;
import org.junit.Test;
public class ConstructionCostTest {
@Test
public void testCalculateConstructionCost() {
ConstructionCost obj1=new ConstructionCost();
assertEquals("Construction Cost of the house",1140750.0,obj1.CalculateConstructionCost("FullyAutomated",456.3),0);
}
}