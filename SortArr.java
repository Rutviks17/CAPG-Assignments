package com.rutviks.java;
import java.util.Scanner;
import java.util.Arrays;

public class SortArr {


    public static void getSortedArr(int[] numbers){
        int i,j,temp;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(numbers[i]<numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array in Ascending Order : "+ Arrays.toString(numbers));
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array in Descending Order : "+ Arrays.toString(numbers));

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

        getSortedArr(arr1);

        sc.close();
    }
}
