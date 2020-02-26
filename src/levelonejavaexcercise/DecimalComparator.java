/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levelonejavaexcercise;

/**
 *
 * @author chakhrit
 */
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

        //cast int and check three decimal places
        return (int) (firstNum * 1000) == (int) (secondNum * 1000);
    }

}
