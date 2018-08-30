package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true, 6));
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking) {
            if ((hourOfDay < 0) || (hourOfDay > 23)) {
                return false;
            }
            if ((hourOfDay < 8) || (hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}