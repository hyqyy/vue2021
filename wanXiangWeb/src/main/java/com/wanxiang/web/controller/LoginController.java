package com.wanxiang.web.controller;

import com.wanxiang.web.pojo.User;
import com.wanxiang.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.Resource;
import java.util.List;


@Controller
public class LoginController {

    @Resource
    UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login.html";
    }


    @RequestMapping(value = "/LoginSuccess",method = RequestMethod.GET)
    public String LoginSuccess(Model model, String username, String password){
        //先查询看该用户名是否存在

        List<User>  ulist = userService.userIsExist(username,password);
        System.out.println("num"+ulist);
        if(ulist.size() != 0){ //  如果查询的用户不为空
            return "success.html";
        }
        else{
            //返回到登录页面
            model.addAttribute("data","该用户不存在，请先注册");
            return "login.html";
        }
    }
}
