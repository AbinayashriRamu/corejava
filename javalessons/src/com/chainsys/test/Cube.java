package com.chainsys.test;
public class Cube {
    public static void main(String[]args) {
        int n=123,o,re,r=0;
        o=n;
        while(o!=0)
        {
            re=o%10;
            r+=re*re*re+n;
            o=o/10;
        }
            if(r==n) {
             System.out.println(n +"Same as input number");
            }
            else {
                System.out.println(n + "Different number");
            }
        }
    }