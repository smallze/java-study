package com.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zzs
 * @date 2022/1/5 16:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherExt {


    private Integer id;
    private String name;
    private List<StudentExt> students;

}
