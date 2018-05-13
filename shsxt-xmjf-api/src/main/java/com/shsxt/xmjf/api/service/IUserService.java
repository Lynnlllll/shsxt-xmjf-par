package com.shsxt.xmjf.api.service;

import com.shsxt.xmjf.api.model.User;

/**
 * Created by lp on 2018/5/11.
 */
public interface IUserService {
    public User queryUserByUserId(Integer userId);
}
