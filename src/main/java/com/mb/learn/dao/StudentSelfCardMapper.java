package com.mb.learn.dao;

import com.mb.learn.po.StudentSelfCardBean;

public interface StudentSelfCardMapper {
    StudentSelfCardBean findCardByStudentId(long id);
}
