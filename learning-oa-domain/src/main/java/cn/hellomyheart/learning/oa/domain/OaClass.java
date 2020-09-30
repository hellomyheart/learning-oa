package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 班级模板
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaClass implements Serializable {
    /**
     * 班级ID
     */
    private Integer cId;

    /**
     * 班级编号
     */
    private String cNo;

    /**
     * 教室地址
     */
    private String cLocation;

    /**
     * 课程ID
     */
    private Integer courseId;

    /**
     * 开班日期
     */
    private Date cTime;

    /**
     * 创建人ID
     */
    private Integer uId;

    /**
     * 创建日期
     */
    private Date cCreatetime;

    /**
     * 修改日期
     */
    private Date cUpdatetime;

    private static final long serialVersionUID = 1L;
}