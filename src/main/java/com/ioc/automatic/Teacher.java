package com.ioc.automatic;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Teacher {

    private Student student;

    public Student getStudent() {
        return student;
    }

    /*public void setStudent(Student student) {
        this.student = student;
    }*/

    public Teacher(Student student) {
        this.student = student;
    }

}
