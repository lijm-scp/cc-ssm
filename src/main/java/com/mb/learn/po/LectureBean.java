package com.mb.learn.po;

public class LectureBean {
    private long id;
    private String lectureName;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "LectureBean{" +
                "id=" + id +
                ", lectureName='" + lectureName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
