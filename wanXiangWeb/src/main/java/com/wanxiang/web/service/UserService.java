package com.wanxiang.web.service;


import com.wanxiang.web.mapper.UserMapper;
import com.wanxiang.web.pojo.User;
import com.wanxiang.web.pojo.UserExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Resource
    private UserMapper userMapper;

    public static String login(String uname, String upwd) {
        if (uname != null && upwd != null) {
            if (uname.equals("huangyunqiang") && upwd.equals("123456")) {
                return "登陆成功！";
            } else {
                return "账号或密码错误！";
            }
        } else {
            return "参数有误！";
        }
    }

    public List<User> userIsExist(String username, String password){
        UserExample example = new UserExample();
        example.setDistinct(true);
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(username);
//        criteria.andNameLike("huang%");

        return userMapper.selectByExample(example);



    }

}

