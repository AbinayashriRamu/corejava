package com.chainsys.unittest;

import com.chainsys.test.Student;

    public class StudentTest {
            public static void testName() {
                Student sc = new Student(101);
                sc.setName("Abi");
                System.out.println(sc.getName());
            }
            public static void testDob() {
                Student sc = new Student(101);
                sc.setDob("12 03 2001");
                System.out.println(sc.getDob());
            }
            public static void testbloodgroup() {
                Student sc = new Student(101);
                sc.setBloodgroup("o+");
                System.out.println(sc.getBloodgroup());
            }
        
            public static void testHeight() {
                Student sc = new Student(101);
                sc.setHeight("xyz@gmail.com");
                System.out.println(sc.getHeight());
            }
            public static void testMarks() {
                Student sc = new Student(101);
                sc.setMarks("90,80,99,88,75");
                System.out.println(sc.getMarks());
            }
    }