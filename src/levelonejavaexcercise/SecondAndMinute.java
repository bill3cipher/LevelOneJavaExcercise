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
public class SecondAndMinute {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minuites, long seconds) {
        if ((minuites < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minuites / 60;
            long remainMinuites = minuites % 60;
            String hourString = hours + "h ";
            if (hours < 10) {
                hourString = "0" + hourString;
            }
            String minuitesString = remainMinuites + "m ";
            if (remainMinuites < 10) {
                minuitesString = "0" + minuitesString;
            }
            String secondstring = seconds + "s ";
            if (seconds < 10) {
                secondstring = "0" + secondstring;
            }
            return hourString + minuitesString + secondstring;
        }
    }

    public static String getDurationString(long seconds) {
        if ((seconds < 0)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long remainSeconds = seconds % 60;
            long minuites = seconds / 60;
            long remainMinuites = minuites % 60;
            long hours = minuites / 60;
            long remainHours = hours % 60;
            long days = hours / 24;
            
            //Lazy to create string ZzZ!
            
            return days + "days " + remainHours + "h " + remainMinuites + "m " + remainSeconds + "s";
        }
    }

}
