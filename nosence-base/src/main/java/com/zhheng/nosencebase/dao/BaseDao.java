package com.zhheng.nosencebase.dao;

import org.apache.ibatis.session.SqlSession;

public abstract class BaseDao {
	protected final SqlSession sqlSession;

	public BaseDao(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}
	
}
