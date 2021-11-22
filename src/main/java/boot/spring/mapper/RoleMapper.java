package boot.spring.mapper;

import java.util.List;

import boot.spring.po.Role;
import boot.spring.po.RolePermission;
import boot.spring.po.UserRoleRel;



public interface RoleMapper {
	List<Role> getRoles();
	void adduserrole(UserRoleRel ur);
	Role getRoleidbyName(String rolename);
	List<Role> getRoleinfo();
	void addRole(Role role);
	void addRolePermission(RolePermission rp);
	void deleterole(int rid);
	void deleterole_permission(int roleid);
	void deleteuser_role(int roleid);
	Role getRolebyid(int rid);
}
