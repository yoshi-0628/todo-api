package com.example.todoapi.repository.task;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface TaskRepository {
    @Select("SELECT id, title FROM tasks where id = #{taskId}")
    Optional<TaskRecord> select(long taskId);
}
