package cn.hellomyheart.learning.oa.user.service;

import cn.hellomyheart.learning.oa.domain.OaWeek;
public interface OaWeekService{


    int deleteByPrimaryKey(Integer wId);

    int insert(OaWeek record);

    int insertSelective(OaWeek record);

    OaWeek selectByPrimaryKey(Integer wId);

    int updateByPrimaryKeySelective(OaWeek record);

    int updateByPrimaryKey(OaWeek record);

}
