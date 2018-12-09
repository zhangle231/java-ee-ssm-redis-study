package org.mybatis.study.pojo;

import java.util.List;

public interface RoleMapper {

	public Role selectRole(Long id);
	
	public int insertRole(Role role);
	
	public int deleteRole(Long id);
	
	public int updateRole(Role role);
	
	public Role getRole(Long id);
	
	public List<Role> findRoles(String roleName);

}
