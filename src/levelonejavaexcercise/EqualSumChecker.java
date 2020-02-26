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
public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        int totalNum = firstNum + secondNum;
        return totalNum == thirdNum;
    }

}
