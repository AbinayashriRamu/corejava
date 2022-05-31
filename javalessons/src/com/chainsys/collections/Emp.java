package com.chainsys.collections;

import java.io.Serializable;

public class Emp  implements Serializable {
    private final int id;
    public String Name;
    public String getID;
    public Emp(int v1,String s) { // this is for serialization 
    //public Emp(int v1) {  //for sethashsetdemo,listArraylistdemo,comparable demo class need to use this..
         id=v1;
        Name=s;
     }
    

    public int getID() {
         return id;
     }
    @Override
    public boolean equals(Object obj) {
    Class c1 =obj.getClass();
        boolean flag = false;
       if(c1==this.getClass()) {
            Emp other=(Emp) obj;
            if(this.hashCode()== other.hashCode()) 
                flag = true;
            }
        return flag;
    }
   /* public int hashCode() { // this for returning int value of hashcode..
        return this.id;
    }*/

}