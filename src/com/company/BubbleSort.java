package com.company;

public class BubbleSort {


    public void sort(int[] array){

        int snurr;

        do {
            snurr = 0;
            for(int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    snurr++;
                }
            }

        } while(snurr != 0);

    }
    public void printSortedArray(int[] array){
        sort(array);
        String outputString = "";
        for(int e: array){
            outputString += e + ", ";
        }
        outputString= outputString.substring(0, outputString.length()-2);
        System.out.println(outputString);

    }
}
