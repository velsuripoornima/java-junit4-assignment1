package com.stackroute.pe1;
import java.util.Scanner;

public class Identification{
    public String classify(String letter){

        char input=letter.charAt(0);
        if(input >= 'a' && input <='z'){
            return input+" is Small letter";
        }
        else if(input >= 'A' && input <= 'Z'){
            return input+" is Capital letter";
        }
        else if(input >= '0' && input <='9' ){
            return input+" is number";
        }
        else if(input =='!' || input == '@' || input == '#' || input == '$' || input == '%' || input == '^' || input =='&'||input=='*'){
            return input+" is Symbol";
        }
        return "Enter Only one letter".trim();
    }

}