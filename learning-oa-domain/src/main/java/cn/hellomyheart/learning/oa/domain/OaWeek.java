package cn.hellomyheart.learning.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 周报
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaWeek implements Serializable {
    /**
     * id
     */
    private Integer wId;

    /**
     * 周报标题
     */
    private String wTitle;

    /**
     * 周报内容
     */
    private String wContent;

    /**
     * 周报发帖人ID
     */
    private Integer uId;

    /**
     * 创建日期
     */
    private Date wCreatetime;

    /**
     * 更新日期
     */
    private Date wUpdatetime;

    private static final long serialVersionUID = 1L;
}