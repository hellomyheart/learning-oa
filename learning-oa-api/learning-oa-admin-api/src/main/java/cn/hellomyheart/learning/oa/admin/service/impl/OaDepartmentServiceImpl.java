package cn.hellomyheart.learning.oa.admin.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learning.oa.admin.mapper.OaDepartmentMapper;
import cn.hellomyheart.learning.oa.domain.OaDepartment;
import cn.hellomyheart.learning.oa.admin.service.OaDepartmentService;
@Service
public class OaDepartmentServiceImpl implements OaDepartmentService{

    @Resource
    private OaDepartmentMapper oaDepartmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer dId) {
        return oaDepartmentMapper.deleteByPrimaryKey(dId);
    }

    @Override
    public int insert(OaDepartment record) {
        return oaDepartmentMapper.insert(record);
    }

    @Override
    public int insertSelective(OaDepartment record) {
        return oaDepartmentMapper.insertSelective(record);
    }

    @Override
    public OaDepartment selectByPrimaryKey(Integer dId) {
        return oaDepartmentMapper.selectByPrimaryKey(dId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaDepartment record) {
        return oaDepartmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaDepartment record) {
        return oaDepartmentMapper.updateByPrimaryKey(record);
    }

}
