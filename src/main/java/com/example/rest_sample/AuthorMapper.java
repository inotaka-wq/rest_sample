package com.example.rest_sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorMapper {
	@Select("SELECT id, first_name, last_name FROM author WHERE id=#{id}")
	Author getById(Integer id);
}
