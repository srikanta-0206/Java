package com.Strings.ASSINMENT;

import java.util.Arrays;
//ZEROS AT FIRST
public class ASSINMENT02_06_02 {
        public static void main(String[] args)
        {
            int[] a={1,0,2,0,3,0};
            int[] b=new int[a.length];
            int count=0;
            for (int i=0;i<a.length ;i++ )
            {
                if(a[i]==0){
                    b[count]=0;
                    count++;
                }
            }
            for (int i=0;i<a.length ;i++ )
            {
                if(a[i]!=0){
                    b[count]=a[i];
                    count++;
                }
            }
            System.out.println(Arrays.toString(b));
        }
    }
