package cn.hellomyheart.learning.oa.user.service.impl;

import cn.hellomyheart.learning.oa.user.mapper.OaEmployeeMapper;
import cn.hellomyheart.learning.oa.user.service.OaEmployeeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import cn.hellomyheart.learning.oa.domain.OaEmployee;

@Service
public class OaEmployeeServiceImpl implements OaEmployeeService {

    @Resource
    private OaEmployeeMapper oaEmployeeMapper;

    @Override
    public int deleteByPrimaryKey(Integer eId) {
        return oaEmployeeMapper.deleteByPrimaryKey(eId);
    }

    @Override
    public int insert(OaEmployee record) {
        return oaEmployeeMapper.insert(record);
    }

    @Override
    public int insertSelective(OaEmployee record) {
        return oaEmployeeMapper.insertSelective(record);
    }

    @Override
    public OaEmployee selectByPrimaryKey(Integer eId) {
        return oaEmployeeMapper.selectByPrimaryKey(eId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaEmployee record) {
        return oaEmployeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaEmployee record) {
        return oaEmployeeMapper.updateByPrimaryKey(record);
    }

}
