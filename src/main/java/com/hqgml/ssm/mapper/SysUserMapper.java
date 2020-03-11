package com.hqgml.ssm.mapper;
import org.apache.ibatis.annotations.Param;

import com.hqgml.ssm.pojo.SysUser;

/**
 * @author Devil
 * @date 2020/3/11 20:22
 */
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    SysUser findOneByUsername(@Param("username")String username);


}