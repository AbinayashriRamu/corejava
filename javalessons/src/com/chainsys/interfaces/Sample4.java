package com.chainsys.interfaces;

public class Sample4  implements Sample2{
    


    @Override
    public int add(int x, int y) {
        System.out.println("Addition:");
        return x+y;}
    

    @Override
    public int multiply(int x, int y) {
        System.out.println("Multiplication:");
        return (x*y);
    }

    @Override()
    public int sub(int x, int y) {
        System.out.println("Subtraction:");
        return (x-y);
    }

    @Override
    public int division(int x, int y) {
        System.out.println("Division:");
        return (x-y);
    }

}