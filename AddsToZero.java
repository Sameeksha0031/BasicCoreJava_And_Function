//package com.bridgelabz.functionalprograms;
import java.util.Scanner; 

public class AddsToZero {

     public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of integer :");
       int number = sc.nextInt();

       int[] arr = new int[number];
       System.out.println("Enter the integers :");

       for (int i = 0; i < number; i++) {
       arr[i] = sc.nextInt();
      }

      int Count = 0;

      for (int i = 0; i < number - 2; i++) {
      for (int j = i + 1; j < number - 1; j++) {
      for (int k = j + 1; k < number; k++) {

      if ((arr[i] + arr[j] + arr[k]) == 0) {
         Count++;
         System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
          }
         }
        }
      }
      System.out.println("Total distinct triples : " + Count);
     }
}
  