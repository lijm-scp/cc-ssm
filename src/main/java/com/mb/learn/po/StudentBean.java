package com.mb.learn.po;

public class StudentBean {
    private long id;
    private String name;
    private String note;
    private StudentSelfCardBean studentSelfCardBean;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public StudentSelfCardBean getStudentSelfCardBean() {
        return studentSelfCardBean;
    }

    public void setStudentSelfCardBean(StudentSelfCardBean studentSelfCardBean) {
        this.studentSelfCardBean = studentSelfCardBean;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", studentSelfCardBean=" + studentSelfCardBean +
                '}';
    }
}
