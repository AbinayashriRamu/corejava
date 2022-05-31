package com.chainsys.test;
import java.util.Scanner;
public class Count{
    public static void main(String[]args){
    }
        public static void count() {
        String f1="Tom and Jerry are good friends";
        int count=1;
        for(int i=0;i<f1.length();i++) {
            if((f1.charAt(i)==' ')) {
                count++;
            }
            System.out.println("word:"+count);
        }
    }

        public static void reverse() {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a sentence");
            String s="";
            try {
                s=scanner.nextLine();
            }finally {
                scanner.close();
            }
            String[] a=s.split(" ");
            int count=a.length;
            
            while(count>0) {
                System.out.print(a[count-1] +" ");
                count--;
            }
}
}