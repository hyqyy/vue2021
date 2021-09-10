package com.wanxiang.web.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class Salary implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private BigDecimal salary;

    private static final long serialVersionUID = 1L;
}