package com.kong.demo.controller;

import com.kong.demo.bean.vo.UserVO;
import com.kong.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author t.k
 * @date 2021/12/1 10:53
 */
@RestController
@RequestMapping("/v1/user")
public class IUserController {
    @Resource
    private IUserService iUserService;

    private Logger logger = LoggerFactory.getLogger(IUserController.class);

    @RequestMapping("/getUserById")
    public String getUserById(@RequestParam("id") String id) {
        return iUserService.getUserById(id);
    }

    @PostMapping(value = "update", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String update(UserVO userVO) {
        return userVO.toString();
    }
}
