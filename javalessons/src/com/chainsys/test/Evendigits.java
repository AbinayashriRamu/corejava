package com.chainsys.test;
import java.util.Scanner;
public class Evendigits {
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        long a=sc.nextLong();
        sc.close();
        long c=a;
        long r=0;
        while(c>0) {
            r = c%10;
            if(r%2==0) {
                System.out.println(r);
            }
            c=c/10;
    }
    }
}