package cn.hellomyheart.learning.oa.user.service;

import cn.hellomyheart.learning.oa.domain.OaUser;
public interface OaUserService{


    int deleteByPrimaryKey(Integer uId);

    int insert(OaUser record);

    int insertSelective(OaUser record);

    OaUser selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(OaUser record);

    int updateByPrimaryKey(OaUser record);

}
