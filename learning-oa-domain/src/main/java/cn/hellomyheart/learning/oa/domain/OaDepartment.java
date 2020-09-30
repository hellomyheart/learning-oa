package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部门表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaDepartment implements Serializable {
    /**
     * id
     */
    private Integer dId;

    /**
     * 部门名
     */
    private String dName;

    /**
     * 部门人数
     */
    private Integer dNum;

    /**
     * 状态，0未激活，1激活
     */
    private String dStatus;

    /**
     * 创建日期
     */
    private Date dCreatetime;

    /**
     * 更新日期
     */
    private Date dUpdatetime;

    private static final long serialVersionUID = 1L;
}