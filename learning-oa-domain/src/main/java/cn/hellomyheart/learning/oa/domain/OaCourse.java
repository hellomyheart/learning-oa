package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课程表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaCourse implements Serializable {
    /**
     * 课程id
     */
    private Integer cId;

    /**
     * 课程名
     */
    private String cName;

    /**
     * 课时（周）
     */
    private String cWeek;

    /**
     * 课程状态（0.未激活，1已激活，2.课程关闭）
     */
    private String cStatus;

    /**
     * 创建日期
     */
    private Date cCreatetime;

    /**
     * 更新日期
     */
    private Date cUpdatetime;

    private static final long serialVersionUID = 1L;
}