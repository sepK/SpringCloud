package com.kong.demo.service;

import org.springframework.stereotype.Service;

/**
 * 用户
 *
 * @author t.k
 * @date 2021/12/1 10:33
 */
public interface IUserService {

    /**
     * 通过id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    String getUserById(String id);
}
