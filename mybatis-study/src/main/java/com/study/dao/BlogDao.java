package com.study.dao;

import com.study.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogDao {

    List<Blog> getBlogList();
}
