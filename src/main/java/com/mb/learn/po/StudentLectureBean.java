package com.mb.learn.po;

import java.math.BigDecimal;

public class StudentLectureBean {
    private long id;
    private long studentId;
    private LectureBean lecture;
    private BigDecimal grade;
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

    public LectureBean getLecture() {
        return lecture;
    }

    public void setLecture(LectureBean lecture) {
        this.lecture = lecture;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentLectureBean{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", lecture=" + lecture +
                ", grade=" + grade +
                ", note='" + note + '\'' +
                '}';
    }
}
