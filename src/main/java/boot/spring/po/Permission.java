package boot.spring.po;

import lombok.Data;

import java.util.List;

@Data
public class Permission {
    /**
     *
     */
    Integer pid;
    /**
     *
     */
    String permissionName;
    /**
     *
     */
    List<RolePermission> rp;
}
