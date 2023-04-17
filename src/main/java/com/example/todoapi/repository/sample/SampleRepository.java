package com.example.todoapi.repository.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {

    @Select("select content from samples order by id limit 1")
    SampleRecord select();

}
