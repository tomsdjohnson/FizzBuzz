package com.company;

public class CheckNumber {
    public static String check(int num){

        String output;
        output = "";

        if ( num%3 == 0) {
            output = (output + "FIZZ");
        }if (num%5 == 0) {
            output = (output + "BUZZ");
        }if (num%7 == 0) {
            output = (output + "BANG");
        }if (output == "") {
            output = ("" + num);
        }
        return output;
    }
}
