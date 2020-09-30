package cn.hellomyheart.learning.oa.admin.service;

import cn.hellomyheart.learning.oa.domain.OaEmployee;
public interface OaEmployeeService{


    int deleteByPrimaryKey(Integer eId);

    int insert(OaEmployee record);

    int insertSelective(OaEmployee record);

    OaEmployee selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(OaEmployee record);

    int updateByPrimaryKey(OaEmployee record);

}
