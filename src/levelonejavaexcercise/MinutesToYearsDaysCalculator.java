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
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minuites) {
        if (minuites < 0) {
            System.out.println("Invalid Value");
        }else {
        long hours = minuites / 60;
        long days = hours / 24;
        long remainingDays = days % 365;
        long years = days / 365;
        System.out.println(minuites + " min" + " = " + years + " y" + " and " + remainingDays + " d");
        }
    }
}
