package com.hqgml.ssm.service;

import com.hqgml.ssm.pojo.IUser;

import java.util.List;

/**
 * @author Devil
 * @date 2020/3/11 17:10
 */
public interface IuserService {
    /**
     * 查找所有
     * @return
     */
    public List<IUser> findAll();


    /**
     * 保存用户信息
     * @param iUser
     */
    public void savaAccount(IUser iUser);
}
