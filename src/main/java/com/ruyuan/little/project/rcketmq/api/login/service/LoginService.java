package com.ruyuan.little.project.rcketmq.api.login.service;

import com.ruyuan.little.project.rcketmq.api.login.dto.LoginRequestDTO;

/**
 * 登录接口 service 组件
 */
public interface LoginService {

    /**
     * 第一次登陆分发优惠券
     *
     * @param loginRequestDTO 登陆信息
     */
    void firstLoginDistributeCoupon(LoginRequestDTO loginRequestDTO);

    /**
     * 重置用户的登录状态
     *
     * @param phoneNumber 手机号
     */
    void resetFirstLoginStatus(String phoneNumber);
}
