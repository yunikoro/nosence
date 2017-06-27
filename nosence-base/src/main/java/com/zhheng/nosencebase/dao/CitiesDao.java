package com.zhheng.nosencebase.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.zhheng.nosencebase.domain.Cities;

@Component
public class CitiesDao extends BaseDao {

	public List<Cities> selectCitiesList() {
		return this.sqlSession.selectList("selectFromCities");
	}
	
	public CitiesDao(SqlSession sqlSession) {
		super(sqlSession);
	}

}
