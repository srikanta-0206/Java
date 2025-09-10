package com.Two_D_Array;

import java.util.Arrays;

public class assin {
    public static void main(String[] args) {
        int[][] a={{10,12,234},{90,39,23},{2323,3434,44,},{1,2,3},{2,4,5}};
        int rows = a.length;
        int cols = a[0].length;
        int[] c = new int[rows * cols];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[k] = a[i][j];
                k++;
            }
        }
        k=0;
        Arrays.sort(c);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j]=c[k];
                k++;
            }
        }
        for(int[] n:a){
            System.out.println(Arrays.toString(n));
        }
    }
}