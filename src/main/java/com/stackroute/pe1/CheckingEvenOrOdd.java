package com.stackroute.pe1;


public class CheckingEvenOrOdd {
       public String odd(int number) {

           if (number % 2 != 0 && (number > 20 && number < 30)) {
               return "Tom";

           } else if( number % 2 == 0 && (number > 20 && number < 30)) {
               return "Jerry";

           }else {
               return null;
           }

       }

}
