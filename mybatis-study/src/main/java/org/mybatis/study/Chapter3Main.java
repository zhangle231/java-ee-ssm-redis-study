package org.mybatis.study;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.mybatis.study.pojo.Role;
import org.mybatis.study.pojo.RoleMapper;

public class Chapter3Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Chapter3Main.class);
		SqlSession sqlSession = null;
		
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			Role role = roleMapper.getRole(1L);
			log.info(role);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
