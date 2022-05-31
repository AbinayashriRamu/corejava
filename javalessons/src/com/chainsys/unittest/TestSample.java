package com.chainsys.unittest;

import com.chainsys.interfaces.Sample;
import com.chainsys.interfaces.Sample4;

public class TestSample {

    public static void main(String[] args) {
        
        Sample s = new Sample4();
        /*int outs =0;
        outs = s.add(8, 4);
        System.out.println(outs);
        outs=s.multiply(4, 2);
        System.out.println(outs);
        //((Sample4) s).sub(56,48);// cascading 
        //((Sample4) s).division(8, 4)*/
        Sample4 s1 = new Sample4();
        /*int out = 0;
        out =s1.division(8,4);
        System.out.println(out);
        out = s1.sub(8, 4);
        System.out.println(out);*/
        System.out.println(s.add(8, 4));
        System.out.println(s.multiply(6, 2));
        System.out.println(s1.division(4, 2));
        System.out.println(s1.sub(4, 2));
        
    }
}