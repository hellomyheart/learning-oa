package cn.hellomyheart.learning.oa.admin.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learning.oa.admin.mapper.OaClassMapper;
import cn.hellomyheart.learning.oa.domain.OaClass;
import cn.hellomyheart.learning.oa.admin.service.OaClassService;
@Service
public class OaClassServiceImpl implements OaClassService{

    @Resource
    private OaClassMapper oaClassMapper;

    @Override
    public int deleteByPrimaryKey(Integer cId) {
        return oaClassMapper.deleteByPrimaryKey(cId);
    }

    @Override
    public int insert(OaClass record) {
        return oaClassMapper.insert(record);
    }

    @Override
    public int insertSelective(OaClass record) {
        return oaClassMapper.insertSelective(record);
    }

    @Override
    public OaClass selectByPrimaryKey(Integer cId) {
        return oaClassMapper.selectByPrimaryKey(cId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaClass record) {
        return oaClassMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaClass record) {
        return oaClassMapper.updateByPrimaryKey(record);
    }

}
