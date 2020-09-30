package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 职工表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaEmployee implements Serializable {
    /**
     * id
     */
    private Integer eId;

    /**
     * 职工姓名
     */
    private String eName;

    /**
     * 职工性别
     */
    private String eSex;

    /**
     * 出生日期
     */
    private Date eBirthday;

    /**
     * 身份证号
     */
    private String eIdentify;

    /**
     * 手机号
     */
    private String ePhone;

    /**
     * 邮箱
     */
    private String eEmail;

    /**
     * 状态，0未入职，1入职，2休假，9离职
     */
    private String eStatus;

    /**
     * 用户ID
     */
    private Integer uId;

    /**
     * 入职日期
     */
    private Date eCreatetime;

    /**
     * 更新日期
     */
    private Date eUpdatetime;

    private static final long serialVersionUID = 1L;
}