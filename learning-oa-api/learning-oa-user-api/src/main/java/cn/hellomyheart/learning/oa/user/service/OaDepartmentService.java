package cn.hellomyheart.learning.oa.user.service;

import cn.hellomyheart.learning.oa.domain.OaDepartment;
public interface OaDepartmentService{


    int deleteByPrimaryKey(Integer dId);

    int insert(OaDepartment record);

    int insertSelective(OaDepartment record);

    OaDepartment selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(OaDepartment record);

    int updateByPrimaryKey(OaDepartment record);

}
