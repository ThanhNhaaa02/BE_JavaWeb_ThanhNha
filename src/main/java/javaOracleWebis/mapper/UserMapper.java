package javaOracleWebis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebis.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUser();
}
