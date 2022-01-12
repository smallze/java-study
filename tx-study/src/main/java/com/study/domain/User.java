package com.study.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zzs
 * @date 2022/1/11 19:17
 */
@Data
public class User {


    private Integer id;

    private String name;

    private String gender;

    private BigDecimal balance;
}
