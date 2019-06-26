package com.stackroute.pe1;
import java.util.Scanner;

public class RepeatChar {
    public String repeat(String str,int number){ //method declaration
        String result="",result1="";
        for(int i=0;i<=number - 1;i++){
            result1 += str.substring(str.length() - number);//repeat string considering the given input number
            result=str+result1;
        }return result.trim();
    }
}
