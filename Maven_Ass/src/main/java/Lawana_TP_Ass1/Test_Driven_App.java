package Lawana_TP_Ass1;

import org.junit.Ignore;
import org.junit.Test;

public class Test_Driven_App {


    public float calculateFloat(float x, float y) {
            return x + y;
    }

    public int calculateInteger(int x, int y) {
        return x + y;
    }

    public boolean checkObjectEquality() {
        String string1 = new String("Lawana");
        String string2 = new String("Lawana");
        return string1.equals(string2);
    }

    public boolean checkObjectIdentity() {
        String string1 = new String();
        String string2 = new String();
        string1 = string2;
        return  string1.equals(string2);

    }
    public boolean checkTruth() {
        return true;
    }
    public boolean checkFalse() {
        return false;
    }

    public Object checkNullness() {
        return null;
    }
    public Object checkNotNull() {
        return "Lawana";
    }

    public boolean checkFailingTest() {
        String str1 = new String("Mzuvukile");
        String str2 = new String("Lawana");
        boolean checkFail;
        checkFail = str1.equals(str2);
        return checkFail;
    }





    @Ignore @Test(timeout = 2000)
    public boolean checkException() throws ArithmeticException {
        try {
            int x, y, z;
            x = 5;
            y = 0;
            z = x / y;
        }
        catch(ArithmeticException e){
            return true;
        }
        return true;
    }


    public int accessArray(){
        int number[] = new int[2];
        number[0] = 10;
        return number[0];
    }

}


