package com.carfix.user.service;

import com.carfix.domain.User;
import com.carfix.user.dao.UserDao;
import com.carfix.utils.BCrypt;
import com.carfix.utils.StringTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pc on 2016/5/12.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo(String username) {
        return userDao.getUserByUsername(username);
    }

    public Long test() {
        return userDao.getUserId();
    }

    public Map<String,Object> login(User userVo) {
        Map<String,Object> result = new HashMap<String, Object>();
        String username = userVo.getUsername();
        User user = userDao.getUserByUsername(username);
        if(user==null){
            result.put("status",false);
            result.put("message","用户不存在");
            return result;
        }
        if(StringTools.isBlank(user.getPassword()) || !BCrypt.checkpw(userVo.getPassword(), user.getPassword())){
            result.put("status",false);
            result.put("message","密码不正确");
            return result;
        }
        userDao.update(user);
        result.put("status",true);
        result.put("message","登录成功");
        result.put("data",user);
        return result;
    }

    public static void main(String[] args) {
        String str = "123456";
        String jiamiPwd = BCrypt.hashpw(str, BCrypt.gensalt(10));
        System.out.println(jiamiPwd);
        System.out.println(BCrypt.checkpw(str, jiamiPwd));
    }
}
