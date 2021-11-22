package boot.spring.po;

import lombok.Data;

@Data
public class RolePermission {
    /**
     *
     */
    Integer rpid;
    /**
     *
     */
    Role role;
    /**
     *
     */
    Permission permission;
}
