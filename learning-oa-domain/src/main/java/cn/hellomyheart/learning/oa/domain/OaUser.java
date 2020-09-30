package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaUser implements Serializable {
    /**
     * 用户主键
     */
    private Integer uId;

    /**
     * 账号
     */
    private String uName;

    private String uPassword;

    /**
     * 头像路径
     */
    private String uImgpath;

    /**
     * 状态，0未激活，1正常状态，2不可用
     */
    private String uStatus;

    /**
     * 创建日期
     */
    private Date uCreatetime;

    /**
     * 更新日期
     */
    private Date uUpdatetime;

    private static final long serialVersionUID = 1L;
}