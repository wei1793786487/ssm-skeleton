package com.hqgml.ssm.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @author Devil
 * @date 2020/3/11 20:22
 */
@Data
public class SysUser implements Serializable {
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

    private static final long serialVersionUID = 1L;
}