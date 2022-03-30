package com.company;

public class Main {
    public static void printArray(int arr[]){
        // output loop to print array in bubble sorting
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+"");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
	/*
         write your code here
         Bubble Sorting
        */
       int arr[] = {9,7,8,3,5,4,1,6};
       for (int i=0; i< arr.length-1; i++){
           for (int j=0; j< arr.length-i-1; j++){
               if(arr[j]>arr[j+1]){
                   // Swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;

               }
           }
       }
        printArray(arr);
    }
}
