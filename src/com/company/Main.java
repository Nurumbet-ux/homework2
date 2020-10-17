package com.company;

import javax.swing.*;

public class Main {
    public static int count = 0;
    public static double sumOf = 0;
    public static int counter = 0;
    public static double arithmeticNumber = 0;

    public static void main(String[] args) {
        double[] noreason = {3.2, 2.4, -1.2, 3.4, 5.6, -7.8, 9.4, -2.3, 4.7, -3.9, 1.9, -12.4, -45.6, 1.7, -8.1};
        for (double temp : noreason) {

            if (temp < 0) {
                count++;
            } else if (temp > 0 && count > 0) {
                sumOf = sumOf + temp;
                counter++;
                arithmeticNumber = sumOf / counter;

            }


        }
        System.out.println(arithmeticNumber);


    }

}
