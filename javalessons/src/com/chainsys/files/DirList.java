package com.chainsys.files;
import java.io.File;

public class DirList {
	 public static void main(String[] args) {
	        String dir="d:/temp";
	        File file = new File(dir);
	        String listoffilenamesindirectory[]=null;
	        if(file.isDirectory()) {
	            System.out.println(dir +" is a Directory ");
	            listoffilenamesindirectory =file.list();
	            for(int i=0;i<listoffilenamesindirectory.length;i++) {
	                File f = new File(dir + "/"+listoffilenamesindirectory[i]);
	                 if (f.isDirectory ()) {
	                        System.out.println("\t<"+f.getName() + "> is a sub directory");
	                        }
	                        else
	                        {
	                        System.out.println("\t"+f.getName() + " is a file");
	                     }}
	        }
	    }
	}


