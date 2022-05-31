package com.chainsys.collections;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
         usingStringArrayList();
}
    public static void usingStringArrayList() {
        ArrayList<String> StringArrayList = new ArrayList<String>();
        System.out.println("Intial size of stringArrayList:"+StringArrayList.size());
        try {
            StringArrayList.add("Car");
            StringArrayList.add("Auto");
            StringArrayList.add("Box");
            StringArrayList.add("Doll");
            StringArrayList.add("Fan");
            //will insert a new value,
            //publishing the current value of index 1 to the next index
            StringArrayList.add(1,"Animal");
            StringArrayList.add("Girl");
            StringArrayList.add("Fan");
            System.out.println("Size of StringArrayList after additions:"+ StringArrayList.size());
            //will replace the value in index 2
            StringArrayList.set(2,"xenas");
            System.out.println("After set(2):"+StringArrayList);
            System.out.println("Last Index of:'Fan'"+StringArrayList.lastIndexOf("Fan"));
            //remove the first instance of 'Fan'
            StringArrayList.remove("Fan");
            StringArrayList.remove(2);
            System.out.println("Size after remove(2):"+StringArrayList.size());
            System.out.println("Contents of StringArrayList:"+StringArrayList);
            //will reduce the capacity
            StringArrayList.trimToSize();
        }catch(Exception err) {
            System.out.println(err.getMessage());
}
}
}