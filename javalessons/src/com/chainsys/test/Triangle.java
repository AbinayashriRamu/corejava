package com.chainsys.test;

public class Triangle {
        public  static void main (String[] args)
        {
            printTriangle();
        }
        public static void printTriangle() {
            int countA;
            for(countA=1;countA<10;countA++) {
                for(int countB=10;countB>countA;countB--) {
                    
                    System.out.print(".");
                }
                for(int countC=countA;countC>=1;countC--) {
                System.out.print(countC);
                }
                for(int countD=2;countD<=countA;countD++) {
                    System.out.print(countD);
                    }
                
                System.out.println();
        }

}
}