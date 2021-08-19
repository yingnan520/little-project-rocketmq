package com.ruyuan.little.project.rcketmq.api.login.controller;

import com.ruyuan.little.project.common.dto.CommonResponse;
import com.ruyuan.little.project.rcketmq.api.login.dto.LoginRequestDTO;
import com.ruyuan.little.project.rcketmq.api.login.service.LoginService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @PostMapping(value = "wxLogin")
    public CommonResponse wxLogin(@RequestBody LoginRequestDTO loginRequestDTO){
        // TODO 模拟收到用户登录请求
        // 第一次登录下发优惠券
        loginService.firstLoginDistributeCoupon(loginRequestDTO);

        return CommonResponse.success();
    }

    @GetMapping(value = "/resetLoginStatus")
    public CommonResponse resetFirstLoginStatus(@RequestParam(value = "phoneNumber") String phoneNumber){

        loginService.resetFirstLoginStatus(phoneNumber);
        return CommonResponse.success();
    }
}
