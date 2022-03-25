package com.rutviks.java;
import java.util.Scanner;


public class MAX_MIN {

    public static int getMaxV(int[] numbers){

        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinV(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[10];
        Scanner sc = new Scanner(System.in);

        int n1,i,max,min;

        System.out.println("Enter 10 Elements to Sort Array : ");

        for(i=0;i<10;i++){
            n1 = sc.nextInt();
            arr1[i]=n1;
        }
        max = getMaxV(arr1);
        min = getMinV(arr1);


        System.out.println("Minimum Element : " + min);
        System.out.println("Maximum Element : " + max);


        sc.close();
    }
}
