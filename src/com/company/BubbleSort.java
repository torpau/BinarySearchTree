package com.company;

public class BubbleSort {


    public static void main(String[] args){


        int[] test = {27,3,38,9,43,20,82};
        int snurr;

        do {
            snurr = 0;
            for(int i = 0; i < test.length-1; i++) {
                if(test[i]>test[i+1]) {
                    int tmp = test[i];
                    test[i] = test[i + 1];
                    test[i + 1] = tmp;
                    snurr++;
                }
                for(int e:test) {
                    System.out.print(e + ", ");
                }
                System.out.println("\n");
            }

        } while(snurr != 0);

    }
}
