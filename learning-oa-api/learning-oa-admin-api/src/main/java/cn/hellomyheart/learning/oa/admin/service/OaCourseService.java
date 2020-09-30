package cn.hellomyheart.learning.oa.admin.service;

import cn.hellomyheart.learning.oa.domain.OaCourse;
public interface OaCourseService{


    int deleteByPrimaryKey(Integer cId);

    int insert(OaCourse record);

    int insertSelective(OaCourse record);

    OaCourse selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(OaCourse record);

    int updateByPrimaryKey(OaCourse record);

}
