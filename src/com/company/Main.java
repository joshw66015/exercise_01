package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        String city = "Columbus";
        int zip = 43215;
        int temp[] = {32,25,27,40,45};
        int sum = 0;
        double avg=0;

        for(int i = 0; i < temp.length ; i++) {
            avg = avg + temp[i];
        }
        avg = avg/5;
        System.out.println("City: "+city+" Zip Code: "+zip+" Average High Temperature: "+avg+" ");

    }
}
