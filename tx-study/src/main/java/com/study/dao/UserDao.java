package com.study.dao;

import com.study.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author zzs
 * @date 2022/1/11 19:23
 */
@Repository
public interface UserDao {

    int reduceMoney(@Param("id") int id, @Param("actionMoney") BigDecimal actionMoney);

    int addMoney(@Param("id") int id, @Param("actionMoney") BigDecimal actionMoney);

    User getUser(int id);
}
