package boot.spring.po;

import lombok.Data;

import java.util.List;

@Data
public class Role {
    /**
     *
     */
    Integer rid;
    /**
     *
     */
    String rolename;
    /**
     *
     */
    List<UserRoleRel> user_roles;
    /**
     *
     */
    List<RolePermission> rolePermissions;
}
