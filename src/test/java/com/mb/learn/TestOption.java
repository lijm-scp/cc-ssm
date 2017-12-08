package com.mb.learn;

import com.mb.learn.dao.RoleMapper;
import com.mb.learn.dao.StudentMapper;
import com.mb.learn.param.RoleParam;
import com.mb.learn.po.Role;
import com.mb.learn.po.StudentBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOption {
    private SqlSession session = null;

    @Before
    public void init() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        session = factory.openSession();
    }

    @Test
    public void testMybatis() throws Exception {

        try {
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            Role role = roleMapper.getRoleById(1l);
            System.out.println(role);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void testRoles() throws Exception {
        try {
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            Map<String, String> map = new HashMap<>();
            map.put("name", "l");
            List<Role> roles = roleMapper.findRolesByMap(map);
            for (Role role : roles) {
                System.out.println(role);
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    @Test
    public void testRolesAnnotation() throws Exception {
        try {
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            List<Role> roles = roleMapper.findRolesByAnnotation("l");
            for (Role role : roles) {
                System.out.println(role);
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    @Test
    public void testRolesParam() throws Exception {
        try {
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            RoleParam param = new RoleParam();
            param.setName("l");
            param.setNote("bbb");
            List<Role> roles = roleMapper.findRolesByParam(param);
            for (Role role : roles) {
                System.out.println(role);
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    @Test
    public void saveRole() throws Exception {
        try {
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setName("abcddddd");
            role.setNote("ddaafff");
            int i = roleMapper.saveRole(role);
            System.out.println(role);
            System.out.println(i);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    @Test
    public void selectStudent() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            StudentBean s = roleMapper.findStudentByName("bbbc");
            System.out.println(s);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    @Test
    public void selectStudentGrade() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            StudentBean s = roleMapper.findStudentByName("wyy");
            System.out.println("-------------------------------------");
            System.out.println(s.getStudentSelfCardBean());
            System.out.println("-------------------------------------");
            System.out.println(s.getStudentLectureList());

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
