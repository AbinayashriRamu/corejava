package com.chainsys.introduction;

public class Sixth {
    public  static void main (String[] args)
    {
        printTriangleB();
    }
    public static void printTriangleB() {
        int countA;
        for(countA=1;countA<=5;countA++) {
            for(int countB=5;countB>countA;countB--) {
                
                System.out.print(" ");
            }
            for(int countC=countA;countC>=1;countC--) {
            System.out.print(countC);
            }
            for(int countD=2;countD<=countA;countD++) {
                System.out.print(countD);
                }
            
            System.out.println();
    }
        for(countA=4;countA>=1;countA--) {
            for(int countB=5;countB>countA;countB--) {
                
                System.out.print(" ");
            }    
            for(int countC=countA;countC>=1;countC--) 
            {
                System.out.print(countC);
            }
            for(int countD=2;countD<=countA;countD++) 
            {
                System.out.print(countD);
            }
            
            System.out.println();
}
}
}