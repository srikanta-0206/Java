package com.Strings.ASSINMENT;
//ZEROS AT LAST
import java.util.Arrays;

public class ASSINMENT02_06_01 {
        public static void main(String[] args)
        {
            int[] a={1,0,2,0,3,0};
            int[] b=new int[a.length];
            int count=0;
            for (int i=0;i<a.length ;i++ )
            {
                if(a[i]!=0){
                    b[count]=a[i];
                    count++;
                }
            }
            for (int i=count;i<a.length ;i++ )
            {
                b[count]=0;
                count++;
            }
            System.out.println(Arrays.toString(b));
        }
    }
