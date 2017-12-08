package com.mb.learn.dao;

import com.mb.learn.po.StudentBean;

public interface StudentMapper {
    StudentBean findStudentByName(String name);
}
