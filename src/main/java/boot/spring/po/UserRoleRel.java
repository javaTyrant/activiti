package boot.spring.po;

import lombok.Data;

@Data
public class UserRoleRel {
    Integer urid;
    User user;
    Role role;
}
