package com.hqgml.ssm.controller;

import com.hqgml.ssm.pojo.SysUser;
import com.hqgml.ssm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Devil
 * @date 2020/3/11 17:14
 */
@Controller
@RequestMapping("demo")
public class iuseController  {

    @Autowired
    private SysUserService sysUserService;


    @RequestMapping("springmvc")
    public String teex(){
        SysUser all = sysUserService.selectByPrimaryKey(1);
        System.out.println(all);
        System.out.println("表现层");
        return "list";
    }
}
