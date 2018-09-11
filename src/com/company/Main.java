package com.company;
public class Main {
    public static void main(String[] args) {

        String output;

        for(int i=1; i<=500; i++){
            output = CheckNumber.check(i);
            System.out.println(output);
        }
    }
}
