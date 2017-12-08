package com.mb.learn.po;

public class StudentSelfCardBean {
    private long id;
    private long studentId;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentSelfCardBean{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", note='" + note + '\'' +
                '}';
    }
}
