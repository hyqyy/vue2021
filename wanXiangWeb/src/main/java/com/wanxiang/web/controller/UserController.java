package com.wanxiang.web.controller;

import com.wanxiang.web.pojo.User;
import com.wanxiang.web.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    // 获取post和get请求url携带参数以及post请求form-data参数，不检验url里面是否携带参数
//    @GetMapping("login1")
//    @PostMapping("/login1")
    @RequestMapping(value = "/login1", method = {RequestMethod.POST, RequestMethod.GET})
    public String login1(String username, String password) {
        System.out.println("login1");
        System.out.println(username + "," + password);
        return UserService.login(username, password);
    }


    // 使用HttpServletRequest获取post请求application/x-www-form-urlencoded形式参数，和get请求参数。
//    @GetMapping("login2")
//    @PostMapping("/login2")
    @RequestMapping(value = "/login2", method = {RequestMethod.POST, RequestMethod.GET})
    public String login2(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("login2");
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return UserService.login(username, password);
    }


    // 使用@RequestBody获取post请求body体json类型参数
    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    public String login3(@RequestBody User user) {
        String username = user.getName();
        String password = user.getPasswd();
        System.out.println("login3");
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return UserService.login(username, password);
    }


//    // 使用@ModelAttribute注解获取POST请求的FORM表单数据
    @RequestMapping(value = "/login4", method = RequestMethod.POST)
    public String login4(@ModelAttribute("user") User user){
        System.out.println(user);
        String username = user.getName();
        String password = user.getPasswd();
        System.out.println("login4");
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return UserService.login(username, password);

    }


    // 使用@RequestParam获取post和get请求url携带参数以及post请求form-data参数，检验url里面是否携带参数，不携带参数报错，可以通过required = false忽略参数检验。
    @RequestMapping(value = "/login5", method = {RequestMethod.POST, RequestMethod.GET})
    public String login5(@RequestParam("username") String username, @RequestParam(value = "password", required = false) String password) {
        System.out.println("login5");
        System.out.println(username + "," + password);
        return UserService.login(username, password);
    }


}
