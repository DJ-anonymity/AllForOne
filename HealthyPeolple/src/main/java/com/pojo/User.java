package com.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer uid;

    private String username;

    private String realname;

    private String password;

    private Integer status;

    private static final long serialVersionUID = 1L;
}