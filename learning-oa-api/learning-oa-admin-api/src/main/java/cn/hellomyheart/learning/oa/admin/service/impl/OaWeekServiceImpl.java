package cn.hellomyheart.learning.oa.admin.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learning.oa.domain.OaWeek;
import cn.hellomyheart.learning.oa.admin.mapper.OaWeekMapper;
import cn.hellomyheart.learning.oa.admin.service.OaWeekService;
@Service
public class OaWeekServiceImpl implements OaWeekService{

    @Resource
    private OaWeekMapper oaWeekMapper;

    @Override
    public int deleteByPrimaryKey(Integer wId) {
        return oaWeekMapper.deleteByPrimaryKey(wId);
    }

    @Override
    public int insert(OaWeek record) {
        return oaWeekMapper.insert(record);
    }

    @Override
    public int insertSelective(OaWeek record) {
        return oaWeekMapper.insertSelective(record);
    }

    @Override
    public OaWeek selectByPrimaryKey(Integer wId) {
        return oaWeekMapper.selectByPrimaryKey(wId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaWeek record) {
        return oaWeekMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaWeek record) {
        return oaWeekMapper.updateByPrimaryKey(record);
    }

}
