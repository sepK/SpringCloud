package com.kong.demo.service;

import com.kong.demo.bean.UserVO;
import feign.Headers;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户service
 *
 * @author t.k
 * @date 2021/12/1 10:30
 */
@FeignClient(value = "EUREKA-CLIENT01", configuration = IUserService.Configuration.class)
public interface IUserService {

    /**
     * 通过id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    @RequestMapping("/v1/user/getUserById")
    String getUserById(@RequestParam("id") String id);

    /**
     * 通过id查询用户
     *
     * @param userVO 用户信息
     * @return 用户信息
     */
    @PostMapping(value = "/v1/user/update", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            headers = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String update(@RequestBody UserVO userVO);

    class Configuration {
        @Bean
        Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
            return new SpringFormEncoder(new SpringEncoder(converters));
        }
    }
}
