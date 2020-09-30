package cn.hellomyheart.learning.oa.user.service;

import cn.hellomyheart.learning.oa.domain.OaLoginlog;
public interface OaLoginlogService{


    int deleteByPrimaryKey(Integer lId);

    int insert(OaLoginlog record);

    int insertSelective(OaLoginlog record);

    OaLoginlog selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(OaLoginlog record);

    int updateByPrimaryKey(OaLoginlog record);

}
