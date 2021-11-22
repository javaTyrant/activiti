package boot.spring.controller;

import boot.spring.pagemodel.MSG;
import boot.spring.po.Role;
import boot.spring.po.RolePermission;
import boot.spring.po.User;
import boot.spring.po.UserRoleRel;
import boot.spring.service.LoginService;
import boot.spring.service.SystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Api(value = "登录登出接口")
@RestController
public class Login {
    @Resource
    LoginService loginService;

    @Resource
    SystemService systemservice;

    @ApiOperation("登录认证")
    @RequestMapping(value = "/loginvalidate", method = RequestMethod.POST)
    public String loginValidate(@RequestParam("username") String username, @RequestParam("password") String pwd, HttpSession httpSession) {
        if (username == null)
            return "login";
        String realpwd = loginService.getpwdbyname(username);
        if (pwd.equals(realpwd)) {
            httpSession.setAttribute("username", username);
            return "index";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("username");
        return "login";
    }

    @ApiOperation("获取当前登录用户信息")
    @RequestMapping(value = "/currentuser", method = RequestMethod.GET)
    public MSG currentUser(HttpSession httpSession) {
        String userid = (String) httpSession.getAttribute("username");
        return new MSG(userid);
    }

    @ApiOperation("获取当前用户的权限列表")
    @RequestMapping(value = "/currentuserpermission", method = RequestMethod.GET)
    public List<String> currentUserPermission(HttpSession httpSession) {
        String username = (String) httpSession.getAttribute("username");
        int uid = systemservice.getUidByusername(username);
        User user = systemservice.getUserByid(uid);
        List<UserRoleRel> roles = user.getUserRoles();
        List<String> list = new ArrayList<>();
        for (UserRoleRel ur : roles) {
            int rid = ur.getRole().getRid();
            Role role = systemservice.getRolebyid(rid);
            List<RolePermission> rps = role.getRolePermissions();
            for (RolePermission rp : rps) {
                list.add(rp.getPermission().getPermissionName());
            }
        }
        return list;
    }
}