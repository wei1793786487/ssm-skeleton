package com.hqgml.ssm.service;

import com.hqgml.ssm.pojo.SysUser;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Devil
 * @date 2020/3/11 20:16
 */
public interface SysUserService extends UserDetailsService {


    int deleteByPrimaryKey(Integer id);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

}

