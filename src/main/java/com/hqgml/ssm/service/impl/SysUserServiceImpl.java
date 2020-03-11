package com.hqgml.ssm.service.impl;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hqgml.ssm.pojo.SysUser;
import com.hqgml.ssm.mapper.SysUserMapper;
import com.hqgml.ssm.service.SysUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Devil
 * @date 2020/3/11 20:16
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;


    /**
     * spring security 标准的认证方法
     * @param username  用户名
     * @return ？？？
     * @throws UsernameNotFoundException 异常
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser=null;
        User user=null;
        try {
            sysUser = sysUserMapper.findOneByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (sysUser!=null){
            List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();

             // 这里只是简单的权限的控制因此只有一个权限

            grantedAuthorities.add(new SimpleGrantedAuthority(sysUser.getUserRole()));
            user=new User(sysUser.getUsername(),sysUser.getUserpass(),grantedAuthorities);
        }
        return user;

    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

}

