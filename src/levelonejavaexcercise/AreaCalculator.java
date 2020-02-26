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
public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        double pi = Math.PI;
        double areaOfCircle = pi * (radius *radius);
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if ((x < 0) | (y < 0)) {
            System.out.println("Invalid value");
            return -1;
        }
        double areaOfRectangle = x * y;
        return areaOfRectangle;
    }
}
