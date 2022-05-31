package com.chainsys.test;

public class Alphabet {
    public static void main(String[]args) {
        String s="Ap1le1";
        boolean r=s.matches("[a-zA-Z]+");
        System.out.println("Does string contains Alphabet?"+r);
        int a=s.length();
        if(a<=8) {
            System.out.println("invalid string");
        }
        else {
            System.out.println("Valid String");                
            }
            
        }
        
    }
