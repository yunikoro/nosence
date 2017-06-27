package com.zhheng.nosencebase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhheng.nosencebase.domain.Cities;

@Mapper
public interface CitiesMapper {
	public List<Cities> selectFromCities();
}
