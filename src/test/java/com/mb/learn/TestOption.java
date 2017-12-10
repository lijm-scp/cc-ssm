package com.mb.learn;

import com.mb.learn.dao.RoleMapper;
import com.mb.learn.dao.StudentMapper;
import com.mb.learn.param.RoleParam;
import com.mb.learn.po.Role;
import com.mb.learn.po.StudentBean;
import com.mb.learn.util.SqlSessionUtil;
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
        session = SqlSessionUtil.getSqlSession();
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

    @Test
    public void testCache() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            StudentBean s = roleMapper.findStudentByName("wyy");
            System.out.println("-------------------------------------");
            System.out.println(s.getStudentSelfCardBean());
            System.out.println("-------------------------------------");
            System.out.println(s.getStudentLectureList());
            System.out.println("-------------第二次查询---------------");
            StudentBean s2 = roleMapper.findStudentByName("wyy");
            System.out.println(s2.getStudentLectureList());
            session.commit();
            System.out.println("-------------第三次查询----------------");
            SqlSession session2 = SqlSessionUtil.getSqlSession();
            StudentBean s3 = session2.getMapper(StudentMapper.class).findStudentByName("wyy");
            System.out.println(s3.getStudentLectureList());
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
    public void findByCon() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            StudentBean s = roleMapper.findStudentByCon(1, "wyy");
            System.out.println(s.getStudentLectureList());
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
    public void findStudentByCon() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            List<StudentBean> s = roleMapper.findStudents(null, "wyy", "2");
            System.out.println(s.get(0).getStudentLectureList());
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
    public void findStudentsByCon() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            List<StudentBean> s = roleMapper.findStudentsByName(null,"wyy");
            System.out.println(s.get(0).getStudentLectureList());
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
    public void findStudentsBytrim() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            List<StudentBean> s = roleMapper.findStudentsByTrim(1l,"wyy");
            System.out.println(s.get(0).getStudentLectureList());
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
    public void updateStudent() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            int i = roleMapper.updateStudent(1l,"wyy","2");
            System.out.println(i);
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
    public void selectStudentBySex() throws Exception {
        try {
            StudentMapper roleMapper = session.getMapper(StudentMapper.class);
            List<StudentBean> ss = roleMapper.findStudentsBySex(new String[]{"1","2"});
            System.out.println(ss.size());
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
