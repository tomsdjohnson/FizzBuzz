package com.company;
public class Main {
    public static void main(String[] args) {

        String output;

        for(int i=1; i<=500; i++){
            output = "";
            if ( i%3 == 0) {
                output = (output + "FIZZ");
            }if (i%5 == 0) {
                output = (output + "BUZZ");
            }if (i%7 == 0) {
                output = (output + "BANG");
            }if (output == "") {
                output = ("" + i);
            }
            System.out.println(output);
        }
    }
}
