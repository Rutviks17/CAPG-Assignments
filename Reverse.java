package com.rutviks.java;
import java.util.Scanner;
import java.util.Arrays;

public class Reverse {

    public static void getReverseArray(int[] numbers){
        int[] rev = new int[10];

        for (int i=0;i<10;i++) {
            rev[9-i] = numbers[i];
        }
        System.out.println("Reversed Array : "+Arrays.toString(rev));
    }
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        Scanner sc = new Scanner(System.in);

        int n1,i;

        System.out.println("Enter 10 Elements to Sort Array : ");

        for(i=0;i<10;i++){
            n1 = sc.nextInt();
            arr1[i]=n1;
        }

        getReverseArray(arr1);


        sc.close();
    }
}
