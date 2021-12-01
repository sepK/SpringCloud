package com.kong.demo.service.impl;

import com.kong.demo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author t.k
 * @date 2021/12/1 10:36
 */
@Service
public class IUserServiceImpl implements IUserService {
    /**
     * 通过id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public String getUserById(String id) {
        return "null";
    }
}
