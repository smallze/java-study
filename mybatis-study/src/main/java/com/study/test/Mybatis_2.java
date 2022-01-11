package com.study.test;

import com.study.dao.BlogDao;
import com.study.dao.UserDao;
import com.study.domain.Blog;
import com.study.domain.User;
import com.study.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 测试 mybatis cache
 * @author zzs
 * @date 2022/1/4 19:38
 */
public class Mybatis_2 {

    /**
     * 一级缓存出现脏读情况
     */
    @Test
    public void test1() {
        SqlSession sqlSession1 = MybatisUtil.getSqlSession();
        SqlSession sqlSession2 = MybatisUtil.getSqlSession();
        try {
            UserDao mapper1 = sqlSession1.getMapper(UserDao.class);
            UserDao mapper2 = sqlSession2.getMapper(UserDao.class);
            User user1 = mapper1.getUserById(1);
            System.out.println("user1:" + user1.toString());

            User userDto = new User();
            userDto.setId(1);
            userDto.setName("小王");
            mapper2.updateUserName(userDto);
            sqlSession2.commit();

            User user2 = mapper1.getUserById(1);
            System.out.println(user2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession1.close();
            sqlSession2.close();
        }
    }

    /**
     * 二级缓存示例
     */
    @Test
    public void test2() {
        SqlSession sqlSession1 = MybatisUtil.getSqlSession();
        SqlSession sqlSession2 = MybatisUtil.getSqlSession();
        try {
            BlogDao blogDao1 = sqlSession1.getMapper(BlogDao.class);
            List<Blog> blogList1 = blogDao1.getBlogList();
            sqlSession1.close();


            BlogDao blogDao2 = sqlSession2.getMapper(BlogDao.class);
            List<Blog> blogList2 = blogDao2.getBlogList();
            sqlSession2.close();

            System.out.println(blogList1 == blogList2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

}
