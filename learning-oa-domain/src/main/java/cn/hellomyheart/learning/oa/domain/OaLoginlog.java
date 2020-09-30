package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录日志
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaLoginlog implements Serializable {
    /**
     * id
     */
    private Integer lId;

    /**
     * 登录IP
     */
    private String lIp;

    /**
     * 登录地址
     */
    private String lLocation;

    /**
     * 登录者ID
     */
    private Integer uId;

    /**
     * 登录时间
     */
    private Date lCreatetime;

    private static final long serialVersionUID = 1L;
}