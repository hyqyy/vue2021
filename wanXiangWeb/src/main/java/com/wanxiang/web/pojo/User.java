package com.wanxiang.web.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
    private String name;

    private String passwd;

    private static final long serialVersionUID = 1L;
}