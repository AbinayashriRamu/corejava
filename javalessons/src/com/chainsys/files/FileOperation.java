
package com.chainsys.files;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
public class FileOperation {
	public static void Create() {
		try {

			File f = new File("D:\\temp.abi");

			if (f.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File Already exists");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static void FileRename() {
		File oldName = new File("D:\\temp.abi");
		File newName = new File("D:\\java.txt");
		if (oldName.renameTo(newName)) {
			System.out.println("renamed");
		} else {
			System.out.println("Error");
		}
	}

	public static void FileAppend() {

		try (FileWriter f = new FileWriter("D:\\java.txt", true);) {

			f.append("abinayashri");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}
	public static void ModifyDataInFile() throws Exception
	{
	    
	    FileOutputStream file = new FileOutputStream("D:java.txt");
	    
	    String modify = "Data is modified!!!";
	    byte[] b = modify.getBytes();
	    file.write(b);
	    file.close();
	    System.out.println("Modification Complete");
	    
	    FileInputStream file1 = new FileInputStream("D:java.txt");
	    int i;
	    while((i=file1.read())!=-1)
	    {
	    System.out.print((char)i);
	    }
	    file1.close();
	}
	public static void ReadDataFromFile() {

        try {
               File myObj = new File("D:\\java.txt");
               Scanner myReader = new Scanner(myObj);
               while (myReader.hasNextLine()) {
                 String data = myReader.nextLine();
                 System.out.println("File reading: "+data);
               }
               myReader.close();
             } catch (FileNotFoundException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
             }
    }
	 public static boolean MoveFile(String oldfolderPath,String newFolderPath)
		{
	        boolean fileMoved = true;

	         try {

	             Files.move(Paths.get(oldfolderPath), Paths.get(newFolderPath),StandardCopyOption.REPLACE_EXISTING);
	             System.out.println("File is move Successful");

	         } catch (Exception e) {

	             fileMoved = false;
	             System.out.println("Error!!!"+e.getMessage());
	         }

	         return fileMoved;
	        }
	
	public static void Delete() {

        File file = new File("D:\\java.txt");

    if (file.delete()) {
        System.out.println("File deleted successfully");
    }
    else {
        System.out.println("Failed to delete the file");
    }
}
	 public static void copy() throws IOException {
	        FileSystem fileSys = FileSystems.getDefault();
	        Path srcPath = fileSys.getPath("D:\\Ss java\\java.txt");
	        Path destPath = fileSys.getPath("D:\\java.txt");
	        try {
	            // TO COPY file1.txt from source to destination folder
	            Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("file copied");
	        } catch (IOException ioe) {
	            System.out.println("file not copy");
	        }
	    }
	
	public static void main(String args[]) throws Exception {

	  //  Create();
	//	FileRename();
	//	FileAppend();
	//	ReadDataFromFile();
	    //MoveFile("D:\\java.txt","D:\\Ss java\\java.txt");
		//ModifyDataInFile();
    //    Delete();
       // copy();
       
    }
	}
	