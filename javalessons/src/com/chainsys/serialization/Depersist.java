package com.chainsys.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:\\temp\\valimai.txt"));
            Employee emp1 =(Employee)in.readObject();
            Employee emp2 =(Employee)in.readObject();
            Employee emp3 =(Employee)in.readObject();
            
            System.out.println(emp1.id+" "+emp1.name);
            System.out.println(emp2.id+" "+emp2.name);
            System.out.println(emp3.id+" "+emp3.name);
            in.close();
            
        }catch(Exception e) {
            System.out.println(e);
        }

    }

}