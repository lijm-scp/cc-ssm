package com.mb.learn.dao;

import com.mb.learn.po.LectureBean;

public interface StudentLectureMapper {
    LectureBean findStudentLectureByStuId(String name);
}
