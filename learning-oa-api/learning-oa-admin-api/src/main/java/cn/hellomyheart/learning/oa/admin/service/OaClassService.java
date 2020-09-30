package cn.hellomyheart.learning.oa.admin.service;

import cn.hellomyheart.learning.oa.domain.OaClass;
public interface OaClassService{


    int deleteByPrimaryKey(Integer cId);

    int insert(OaClass record);

    int insertSelective(OaClass record);

    OaClass selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(OaClass record);

    int updateByPrimaryKey(OaClass record);

}
