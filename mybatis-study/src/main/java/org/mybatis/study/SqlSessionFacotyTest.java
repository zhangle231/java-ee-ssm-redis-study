package org.mybatis.study;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.study.pojo.Role;
import org.mybatis.study.pojo.RoleMapper;

public class SqlSessionFacotyTest {

	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory = null;
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			// 方法1
			Role role = (Role) sqlSession.selectOne("org.mybatis.study.pojo.RoleMapper.selectRole", 1L);
			System.out.println(role);
			// 方法2
			role = (Role) sqlSession.selectOne("selectRole", 1L);
			System.out.println(role);
			// 方法3-推荐使用这种方式
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			role = roleMapper.selectRole(1L);
			System.out.println(role);

			for (int i = 0; i < 100; i++) {
				Role newRole = new Role();
				newRole.setRoleName("zl" + i);
				newRole.setNote("note test");
				roleMapper.insertRole(newRole);
			}

//			roleMapper.deleteRole(2L);

			Role oldRole = roleMapper.getRole(1L);
			System.out.println(oldRole);

			List<Role> roles = roleMapper.findRoles("z");
			for (Role r : roles) {
				System.out.println(r);
			}

//			for (int i = 0; i < 1000; i++) {
//				Role newRole = new Role();
//				newRole.setId(1L);
//				newRole.setRoleName("zl" + i);
//				newRole.setNote("123123");
//
//				roleMapper.updateRole(newRole);
//
//				sqlSession.commit();
//				Thread.sleep(1000);
//			}
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		System.out.println("程序执行完成");
	}

}
