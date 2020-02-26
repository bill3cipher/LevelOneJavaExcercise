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
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking) {
            if (hourOfDay < 0 || hourOfDay > 23){
                return false;
            }else return hourOfDay > 22 || hourOfDay < 8;
        }
        return false;
    }
}
