package com.chainsys.introduction;

public class Fifth {

    public static void main(String[] args) {
        //printTriangleB();
        //printNumbersOneToTen(); 
        printid();
        
    }
    public static void printNumbersOneToTen() {
        int count;
        for(count=1;count<=10;count++) 
        {
            System.out.print(count+" ");
        }
    }
    public static void printid() {
        int x=1;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(--x);
        
    }
    public static void printNumbersTenToOne() {
        int count;
        for(count=10;count>=1;count--) 
        {
            System.out.println(count +" ");
        }
    }
    public static void printMatrix() {
    
        for(int countA=1;countA<=5;countA++) 
        {
            for(int countB=1;countB<=5;countB++) 
            {
            System.out.print(countB + " ");
        }
        System.out.println();
        }
}
    public static void printTriangle() {
        int countA;
        for(countA=1;countA<=5;countA++) 
        {
            for(int countB=1;countB<countA;countB++) {
                System.out.print(countB +"");
            }
        System.out.println(" ");
        }
        }
        public static void printTriangleA() {
            int countA;
            for(countA=1;countA<=5;countA++) 
            {
                for(int countB=1;countB<countA;countB++) {
                    System.out.print(".");
                }
            for(int countC=countA;countC>=1;countC--) {
                System.out.print(countC);
                }
            System.out.println("");
            
            }
    }
        public static void printTriangleB() {
            int countA;
            for(countA=1;countA<=5;countA++) 
            {
                for(int countB=5;countB>countA;countB--) {
                    System.out.print(".");
                }
            for(int countC=countA;countC>=1;countC--) {
                System.out.print(countC);
                }
            System.out.println("");
}
}
}