package com.mb.learn.po;

import java.util.List;

public class StudentBean {
    private long id;
    private String name;
    private String sex;
    private StudentSelfCardBean studentSelfCardBean;
    private List<StudentLectureBean> studentLectureList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StudentSelfCardBean getStudentSelfCardBean() {
        return studentSelfCardBean;
    }

    public void setStudentSelfCardBean(StudentSelfCardBean studentSelfCardBean) {
        this.studentSelfCardBean = studentSelfCardBean;
    }

    public List<StudentLectureBean> getStudentLectureList() {
        return studentLectureList;
    }

    public void setStudentLectureList(List<StudentLectureBean> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", studentSelfCardBean=" + studentSelfCardBean +
                ", studentLectureList=" + studentLectureList +
                '}';
    }
}
