package com.jjhayes;


import java.io.IOException;

public class Main {

    private static String printOutPut = "Hello Jackson";

    public static void main(String[] args) {
        System.out.println(printOutPut);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
