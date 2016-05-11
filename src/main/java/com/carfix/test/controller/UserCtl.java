package com.carfix.test.controller;

import com.carfix.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pc on 2016/5/12.
 */
@Controller
public class UserCtl {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/test",method = RequestMethod.GET)
    @ResponseBody
    public String getUserInfo(){
        return userService.getUserInfo();
    }
}
