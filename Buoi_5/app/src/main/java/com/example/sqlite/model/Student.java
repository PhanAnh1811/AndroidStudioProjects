package com.example.sqlite.model;

public class Student {
    private long mStudentId;
    private String mStudentName;
    private String mStudentClass;

    public long getmStudentId(){
        return mStudentId;
    }
    public String getmStudentName(){
        return mStudentName;
    }
    public String getmStudentClass(){
        return mStudentClass;
    }
    public void setmStudentId(long mStudentId) {
        this.mStudentId = mStudentId;
    }

    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public void setmStudentClass(String mStudentClass) {
        this.mStudentClass = mStudentClass;
    }

    public Student() {
        this.mStudentId = mStudentId;
        this.mStudentName = mStudentName;
        this.mStudentClass = mStudentClass;
    }
}
