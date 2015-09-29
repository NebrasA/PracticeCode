package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class array_rotate_problem {

            public static void main(String[] args) {
                // write your code here
                Scanner in = new Scanner(System.in);
                int[] arr = {1,2,3};
                System.out.println(arr[0]);
                System.out.print("Enter n:");

                int n = in.nextInt();
                int i = 0;
                int[] result;
                result = new int[]{};
                while(i < n){
                    int[] temp = arr;
                    temp[0] = arr[arr.length-1];

                    for(int m = 1;m < arr.length;m++){
                        System.out.println("m-1 is: " + (m-1));
                        System.out.println("Current is: " + arr[m-1]);
                        temp[m] = arr[m-1];
                    }
                    result = temp;
                    i++;
                }
            System.out.println("result is: " + Arrays.toString(result));
            }
}
