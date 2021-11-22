package boot.spring.service.impl;


import boot.spring.mapper.LoginMapper;
import boot.spring.po.User;
import boot.spring.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 5)
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginMapper loginmapper;

    public String getpwdbyname(String name) {
        User s = loginmapper.getpwdbyname(name);
        if (s != null)
            return s.getPassword();
        else
            return null;
    }

}
