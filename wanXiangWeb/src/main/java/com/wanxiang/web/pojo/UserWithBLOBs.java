package com.wanxiang.web.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserWithBLOBs extends User implements Serializable {
    private byte[] sslCipher;

    private byte[] x509Issuer;

    private byte[] x509Subject;

    private String authenticationString;

    private static final long serialVersionUID = 1L;
}