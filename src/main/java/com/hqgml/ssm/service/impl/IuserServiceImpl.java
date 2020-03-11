package com.hqgml.ssm.service.impl;

import com.hqgml.ssm.mapper.IuseMapper;
import com.hqgml.ssm.pojo.IUser;
import com.hqgml.ssm.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Devil
 * @date 2020/3/11 17:11
 */
@Service
public class IuserServiceImpl implements IuserService {

    @Autowired
    private IuseMapper iuseMapper;

    @Override
    public List<IUser> findAll() {
        System.out.println("查询");
        return iuseMapper.findAll();
    }

    @Override
    public void savaAccount(IUser iUser) {
        System.out.println("添加");
//        iuseMapper.savaAccount(iUser);
    }
}
