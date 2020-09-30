package cn.hellomyheart.learning.oa.admin.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learning.oa.domain.OaUser;
import cn.hellomyheart.learning.oa.admin.mapper.OaUserMapper;
import cn.hellomyheart.learning.oa.admin.service.OaUserService;
@Service
public class OaUserServiceImpl implements OaUserService{

    @Resource
    private OaUserMapper oaUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer uId) {
        return oaUserMapper.deleteByPrimaryKey(uId);
    }

    @Override
    public int insert(OaUser record) {
        return oaUserMapper.insert(record);
    }

    @Override
    public int insertSelective(OaUser record) {
        return oaUserMapper.insertSelective(record);
    }

    @Override
    public OaUser selectByPrimaryKey(Integer uId) {
        return oaUserMapper.selectByPrimaryKey(uId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaUser record) {
        return oaUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaUser record) {
        return oaUserMapper.updateByPrimaryKey(record);
    }

}
