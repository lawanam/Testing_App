package Lawana_TP_Ass1;

import junit.framework.TestCase;

public class Testing_App extends TestCase{

    Test_Driven_App tDA = new Test_Driven_App();

    public void testFloat() throws Exception {
        assertEquals(tDA.calculateFloat(4.0f,2.0f),6.0f);
    }
     public void testInteger()throws Exception {
         assertEquals(tDA.calculateInteger(2,4),6);
     }
    public void testObjectEquality() throws Exception {
        assertTrue(tDA.checkObjectEquality());
    }
    public void testObjectIdentity() throws Exception {
        assertTrue(tDA.checkObjectIdentity());
    }
    public void testTruth() throws Exception {
        assertTrue(tDA.checkTruth());
    }

    public void testFalse() throws Exception {
        assertFalse(tDA.checkFalse());
    }
    public void testNullness() throws Exception {
        assertNull(tDA.checkNullness());
    }
    public void testNotNull() throws Exception {
        assertNotNull(tDA.checkNotNull());
    }
    public void testFailingTest() throws Exception {
        assertFalse(tDA.checkFailingTest());

    }
    public void testException(){
        assertTrue(tDA.checkException());

    }
    public void testArrayAccess() throws Exception {
        assertEquals(tDA.accessArray(),20);
    }




}
