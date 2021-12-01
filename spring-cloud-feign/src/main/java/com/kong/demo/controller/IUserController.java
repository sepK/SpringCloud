package com.kong.demo.controller;

import com.kong.demo.bean.UserVO;
import com.kong.demo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户
 *
 * @author t.k
 * @date 2021/12/1 10:34
 */
@RestController
@RequestMapping("/v1/user")
public class IUserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/getUserById")
    public String getUserById(@RequestParam("id") String id) {
        return userService.getUserById(id);
    }


    @PostMapping(value = "update")
    public String update(UserVO userVO) {
        return userService.update(userVO);
    }
}
