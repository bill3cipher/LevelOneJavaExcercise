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
public class TeenNumberChecker {

    public static boolean hasTeen(int firstTeen, int secondTeen, int thirdTeen) {
        return (firstTeen >= 13 && firstTeen <= 19) || (secondTeen >= 13 && secondTeen <= 19) || (thirdTeen >= 13 && thirdTeen <= 19);
    }

    public static boolean isTeen(int teenAge) {
        return teenAge >= 13 && teenAge <= 19;
    }
}
