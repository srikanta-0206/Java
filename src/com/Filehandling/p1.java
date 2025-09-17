package com.Filehandling;

import java.io.File;
import java.io.IOException;

public class p1 {


    public static void main(String[] args) throws IOException {
        File f =  new File("C:\\Users\\asust\\Desktop\\Filehhandle\\a.txt");
//        System.out.println(f.mkdir());
//        System.out.println(f.createNewFile());
        System.out.println(f.canRead());
        System.out.println(f.canExecute());
        System.out.println(f.canWrite());
    }
}
