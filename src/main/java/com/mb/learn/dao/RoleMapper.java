package com.mb.learn.dao;

import com.mb.learn.param.RoleParam;
import com.mb.learn.po.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    public Role getRoleById(long id);
    public int saveRole(Role role);
    List<Role> findRolesByMap(Map<String,String> param);
    List<Role> findRolesByAnnotation(@Param("name") String name);
    List<Role> findRolesByParam(RoleParam param);
}
