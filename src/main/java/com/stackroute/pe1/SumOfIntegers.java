package com.stackroute.pe1;
import java.util.Scanner;

public class SumOfIntegers {
    public String getSumOfArguments(String numbers)
        {try {
            int sum = 0;
            String[] arr = numbers.split(" ");
            int[] intarr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                {
                    intarr[i] = Integer.parseInt(arr[i]);
                }

                sum = sum + intarr[i];
            }return sum + "";
        }
        catch (Exception e)
        {
            return "Please enter all integers";
//                    System.exit(0);
        }

        }

}
