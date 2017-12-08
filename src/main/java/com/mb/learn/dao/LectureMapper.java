package com.mb.learn.dao;

import com.mb.learn.po.LectureBean;

public interface LectureMapper {
    LectureBean findLectureById(String name);
}
