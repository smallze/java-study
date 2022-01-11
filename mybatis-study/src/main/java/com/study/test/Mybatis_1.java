package com.study.test;

import com.github.pagehelper.PageHelper;
import com.study.dao.UserDao;
import com.study.domain.Student;
import com.study.domain.TeacherExt;
import com.study.domain.User;
import com.study.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 初步使用mybatis
 *
 * @author zzs
 * @date 2022/1/4 19:38
 */
public class Mybatis_1 {

    /**
     * select 查询
     */
    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
//            User user1 = mapper1.getUserById(1);
//            System.out.println("user1:" + user1.toString());

            PageHelper.startPage(1, 5);
            List<User> userList = mapper1.getUserList();
            for (User user : userList) {
                System.out.println(user.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * update 修改成功
     */
    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(1);
            user.setName("老王" + new Random().nextInt(100));
            int changeNum = mapper1.updateUserName(user);
            sqlSession.commit(); // 需要提交
            System.out.println("changeNum:" + changeNum);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * update 修改不成功
     */
    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(1);
            user.setName("老王64");
            int changeNum = mapper1.updateUserName(user);
            sqlSession.commit(); // 需要提交
            System.out.println("changeNum:" + changeNum);
//            changeNum  与 useAffectedRows=true
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * insert 插入
     */
    @Test
    public void test4() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(2);
            user.setName("张三");
            int changeNum = mapper1.insertUser(user);
            sqlSession.commit(); // 需要提交
            System.out.println("changeNum:" + changeNum);
//            changeNum  与 useAffectedRows=true
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * insert 插入
     */
    @Test
    public void test5() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            int changeNum = mapper1.insertUser1(3, "李四");
            sqlSession.commit(); // 需要提交
//            xml中使用#{arg0} #{arg1} 需注意mybatis版本，mybatis3.4.2使用#{arg0} 之前的使用#{0}
            System.out.println("changeNum:" + changeNum);
//            changeNum  与 useAffectedRows=true
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * insert hashmap 插入
     */
    @Test
    public void test6() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            HashMap<String, Object> map = new HashMap<>(2);
            map.put("id", 4);
            map.put("name", "王二");
            int changeNum = mapper1.insertUserWithMap(map);
            sqlSession.commit(); // 需要提交
            System.out.println("changeNum:" + changeNum);
//            changeNum  与 useAffectedRows=true
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * hashmap 查询
     */
    @Test
    public void test7() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            HashMap<String, Object> map = mapper1.getUserWithHasMap(4);
            System.out.println(map.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * like 查询
     */
    @Test
    public void test8() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            /*
            *      where name like "%"#{name}"%"
            *      where name like CONCAT('%',#{name},'%')
            * */
            List<User> users = mapper1.getUserListLike("张");
            for (User user : users) {
                System.out.println(user.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * association 多对一
     */
    @Test
    public void test9() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            List<Student> students = mapper1.getStudentList();
            for (Student student : students) {
                System.out.println(student.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * association 多对一
     */
    @Test
    public void test10() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            List<Student> students = mapper1.getStudentList2();
            for (Student student : students) {
                System.out.println(student.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    /**
     * collection 一对多
     */
    @Test
    public void test11() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession.getMapper(UserDao.class);
            List<TeacherExt> teacherList1 = mapper1.getTeacherList1();
            for (TeacherExt teacherExt : teacherList1) {
                System.out.println(teacherExt.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


}
