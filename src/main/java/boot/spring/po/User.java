package boot.spring.po;

import lombok.Data;

import java.util.List;

@Data
public class User {
    /**
     *
     */
    Integer uid;
    /**
     *
     */
    String username;
    /**
     *
     */
    String password;
    /**
     *
     */
    String tel;
    /**
     *
     */
    Integer age;
    /**
     *
     */
    List<UserRoleRel> userRoles;

    @Override
    public String toString() {
        return "User [uid=" + uid + ", username=" + username + ", password="
                + password + ", tel=" + tel + ", age=" + age + ", user_roles="
                + userRoles + "]";
    }


}
