package cn.hellomyheart.learning.oa.user.service.impl;

import cn.hellomyheart.learning.oa.user.mapper.OaLoginlogMapper;
import cn.hellomyheart.learning.oa.user.service.OaLoginlogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learning.oa.domain.OaLoginlog;

@Service
public class OaLoginlogServiceImpl implements OaLoginlogService {

    @Resource
    private OaLoginlogMapper oaLoginlogMapper;

    @Override
    public int deleteByPrimaryKey(Integer lId) {
        return oaLoginlogMapper.deleteByPrimaryKey(lId);
    }

    @Override
    public int insert(OaLoginlog record) {
        return oaLoginlogMapper.insert(record);
    }

    @Override
    public int insertSelective(OaLoginlog record) {
        return oaLoginlogMapper.insertSelective(record);
    }

    @Override
    public OaLoginlog selectByPrimaryKey(Integer lId) {
        return oaLoginlogMapper.selectByPrimaryKey(lId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaLoginlog record) {
        return oaLoginlogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaLoginlog record) {
        return oaLoginlogMapper.updateByPrimaryKey(record);
    }

}
