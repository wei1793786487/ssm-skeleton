package com.hqgml.ssm.controller;

import com.hqgml.ssm.pojo.IUser;
import com.hqgml.ssm.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Devil
 * @date 2020/3/11 17:14
 */
@Controller
@RequestMapping("demo")
public class iuseController  {

    @Autowired
    private IuserService iuserService;


    @RequestMapping("springmvc")
    public String teex(){
        List<IUser> all = iuserService.findAll();
        System.out.println(all);
        System.out.println("表现层");
        return "list";
    }
}
