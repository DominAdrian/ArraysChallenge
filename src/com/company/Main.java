package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int numbers = 5;
        int[] myIntegers = getIntegers(numbers);

        printArray(myIntegers);
        System.out.println();
//        sortIntegers(myIntegers);
        printArray(sortIntegers(myIntegers));
        printArray(copyAndSortIntegers(myIntegers));
    }

    //WCZYTYWANIE TABLICY
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values \r");
        int[] arrays = new int[number];

        for(int i=0; i<arrays.length; i++){
            arrays[i] = scan.nextInt();
        }
        return arrays;
    }

    //WYPISANIE TABLICY
    public static void printArray(int[] myIntegers){
        for (int i=0; i<myIntegers.length; i++){
            System.out.println("In place " + i + " we have " + myIntegers[i]);
        }
    }

    //SORTOWANIE TABLICY (dłuższe działanie programu)
    public static int[] sortIntegers(int[] myIntegers){
//        int[] sortedArray = new int[myIntegers.length];
//        for (int i=0; i<myIntegers.length; i++){
//            sortedArray[i] = myIntegers[i];
//        }
        int[] sortedArray = Arrays.copyOf(myIntegers, myIntegers.length);

        int temp;
        for (int i=0; i<sortedArray.length; i++){
            for (int j=0; j<sortedArray.length -1; j++){
                if(sortedArray[j] < sortedArray[j+1]){
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }

        return sortedArray;
    }

    //SORTOWANIE PRZY MNIEJSZEJ ILOSCI SPRAWDZANIA
    public static int[] copyAndSortIntegers(int[] array){
        int[] sortIntegers = new int[array.length];
        for (int i=0; i<array.length; i++){
            sortIntegers[i]=array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i=0; i<sortIntegers.length-1; i++){
                if(sortIntegers[i]>sortIntegers[i+1]){
                    temp = sortIntegers[i];
                    sortIntegers[i]=sortIntegers[i+1];
                    sortIntegers[i+1]=temp;
                    flag = true;
                }
            }
        }

        return sortIntegers;
    }
}
