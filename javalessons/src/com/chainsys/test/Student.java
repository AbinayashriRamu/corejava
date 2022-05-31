package com.chainsys.test;

public class Student {
    private final int studentId;
    private String name;
    private  String dob;
    private String bloodgroup;
    private String height ;
    private String marks;
    public Student(int studentid) {
        this.studentId=studentid;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDob() {
        return dob;
    }
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
    public String getBloodgroup() {
        return bloodgroup;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeight() {
        return height;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }
    public String getMarks() {
        return marks;
    }
    
    
}