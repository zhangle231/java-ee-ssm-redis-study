package org.mybatis.study;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.mybatis.study.pojo.Role;
import org.mybatis.study.pojo.RoleMapper;

public class Chapter3Main {

    /**
     * 1234
     * @param args
     */
	public static void main(String[] args) {
		Logger LOG = Logger.getLogger(Chapter3Main.class);
		
		LOG.debug("begin now.");
		SqlSession sqlSession = null;
		
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			Role role = new Role();
			role.setRoleName("zhao yun");
			role.setNote("note 123456.");
			
			Role role2 = roleMapper.getRole2(1206L);
			System.out.println(role2);
			
//			roleMapper.insertRole3(role);
//			sqlSession.commit();
//			System.out.println(role.getId());
//			Role role = roleMapper.getRole(1L);
//			log.info(role);
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = userMapper.getUser(1L);
//			System.out.println(user.getSex());
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
