package com.study.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zzs
 * @date 2022/1/10 17:23
 */
@Data
public class Blog implements Serializable{

    private Integer id;

    private String title;

    private String content;
}
