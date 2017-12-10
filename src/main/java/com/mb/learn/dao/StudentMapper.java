package com.mb.learn.dao;

import com.mb.learn.po.StudentBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    StudentBean findStudentByName(String name);

    List<StudentBean> findStudentsByName(@Param("id") Long id, @Param("name") String name);

    List<StudentBean> findStudentsByTrim(@Param("id") Long id, @Param("name") String name);

    StudentBean findStudentByCon(@Param("id") long id, @Param("name") String name);

    List<StudentBean> findStudents(@Param("id") Long id, @Param("name") String name, @Param("sex") String sex);

    int updateStudent(@Param("id") Long id, @Param("name") String name, @Param("sex") String sex);

    List<StudentBean> findStudentsBySex(@Param("sexs")String[] sexs);
}
