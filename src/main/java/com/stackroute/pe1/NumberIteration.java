package com.stackroute.pe1;
import java.util.Scanner;

public class NumberIteration {
    public String iteratnumber(int number){
        String result=" ";
        for (int i=1;i<=number;i++){
            for (int j=1;j<= i;j++){
                 result += " "+i;
            }
        }return result.trim();
    }
}
