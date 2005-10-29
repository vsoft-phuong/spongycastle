package org.bouncycastle.crypto.test;

import org.bouncycastle.util.test.SimpleTestResult;

import junit.framework.*;

public class AllTests
    extends TestCase
{   
    public void testCrypto()
    {   
        org.bouncycastle.util.test.Test[] tests = RegressionTest.tests;
        
        for (int i = 0; i != tests.length; i++)
        {
            SimpleTestResult  result = (SimpleTestResult)tests[i].perform();
  
            if (!result.isSuccessful())
            {
                fail(result.toString());
            }
        }
    }
    
    public static void main (String[] args)
    {
        junit.textui.TestRunner.run(suite());
    }
    
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Crypto Tests");
        
        suite.addTestSuite(AllTests.class);
        
        return suite;
    }
}
