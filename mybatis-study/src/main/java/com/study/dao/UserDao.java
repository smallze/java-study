package com.study.dao;

import com.study.domain.Student;
import com.study.domain.TeacherExt;
import com.study.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author zzs
 * @date 2022/1/5 16:37
 */
@Mapper
public interface UserDao {

    User getUserById(Integer id);

    List<User> getUserList();

    int updateUserName(User user);

    int insertUser(User user);

    int insertUser1(Integer id, String name);

    int insertUserWithMap(HashMap<String, Object> map);

    HashMap<String,Object> getUserWithHasMap(@Param("id") int sdsadasdsa);

    List<User> getUserListLike(String name);

    List<Student> getStudentList();

    List<Student> getStudentList2();

    List<TeacherExt> getTeacherList1();
}
