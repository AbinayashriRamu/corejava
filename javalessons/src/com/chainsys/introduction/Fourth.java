package com.chainsys.introduction;
public class Fourth {
    public static void main(String[]args) {
        taskA();
    }
    public static void taskA() {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("What is your name?");
    String name = sc.next();
    System.out.println(name);
    sc.close();
    }
    public static void taskB() {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a number");
    int fv = sc.nextInt();
    int r = fv * 100;
    System.out.println(r);
    sc.close();
    }
    public static void taskC() {
    String s1="3";
    String  s2="5";
    System.out.println(s1+s2);
    int x=Integer.parseInt(s1);
    int y=Integer.parseInt(s2);
    int z=x+y;
    System.out.println(z);
    }
    public static void taskD() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<=0)
            System.out.println("Invalid Age");
        else if(age<18)
            System.out.println("Get driving license");
        else
            System.out.println("Happy Driving");
        sc.close();
    }
}