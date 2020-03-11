package com.hqgml.ssm.pojo;


import lombok.Data;

import javax.persistence.*;

/**
*@author Devil
*@date  2020/3/10 22:34
*/
@Data
@Table(name = "`user`")
public class IUser {
    /**
     * userid
     */
    private Integer id;

    /**
     * username
     */
    private String username;

    /**
     * userpass
     */
    private String userpass;

    /**
     * usersex
     */
    private String usersex;

    private String userRole;

    private Integer idCard;
}