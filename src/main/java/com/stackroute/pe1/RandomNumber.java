package com.stackroute.pe1;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public String random(int number,int usernumber){
//        Random random=new Random();
//        int number=random.nextInt(50);
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your guessing number between 1 to 50: ");
//        while (number != usernumber){
//            System.out.println("enter your guessing number:");
//            usernumber=scanner.nextInt();
        if(usernumber>=1 && usernumber<=50){

            if (number > usernumber) {
                return "your guessing number is less than original number";
            } else if (number < usernumber) {
                return "your guessing number is greater than original number";
            } else {
                return "your guessing number is equal to original number";
//                break;
            }

        }return null;

    }
}
