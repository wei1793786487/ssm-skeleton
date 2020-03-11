package com.hqgml.ssm.mapper;

import com.hqgml.ssm.pojo.IUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Devil
 * @date 2020/3/11 17:08
 */
public interface IuseMapper {


    /**
     * 查找所有
     * @return
     */
    @Select("select  *from user ")
    public List<IUser> findAll();


    /**
     * 保存用户信息
     * @param iUser
     */
    @Insert("insert  into  user(username,userpass) values (#{username} ,#{userpass} )")
    public void savaUser(IUser iUser);
}
