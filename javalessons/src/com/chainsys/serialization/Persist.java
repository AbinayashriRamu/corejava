package com.chainsys.serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101,"Ruby");
            Employee emp2 = new Employee(102,"Robin");
            Employee emp3 = new Employee(101,"Hilter");
            
            FileOutputStream f =new FileOutputStream("d:\\temp\\valimai.txt");
            ObjectOutputStream obj = new ObjectOutputStream(f);
            obj.writeObject(emp1);
            obj.writeObject(emp2);
            obj.writeObject(emp3);
            obj.flush();
            obj.close();
            System.out.println("Serialization and deserialization successfully executed");
        }catch(Exception e) {
            System.out.println(e);}
        }

    }