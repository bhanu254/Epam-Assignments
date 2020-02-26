package epamass.logass;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class loggerTest extends TestCase
{
    public loggerTest( String testName )
    {
        super( testName );
    }
    public static Test suite()
    {
        return new TestSuite( loggerTest.class );
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
