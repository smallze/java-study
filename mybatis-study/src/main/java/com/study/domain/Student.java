package com.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zzs
 * @date 2022/1/5 16:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    private Integer id;
    private String name;
    private Teacher teacher;

}
