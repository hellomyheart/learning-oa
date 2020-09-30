package cn.hellomyheart.learning.oa.admin.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learning.oa.domain.OaCourse;
import cn.hellomyheart.learning.oa.admin.mapper.OaCourseMapper;
import cn.hellomyheart.learning.oa.admin.service.OaCourseService;
@Service
public class OaCourseServiceImpl implements OaCourseService{

    @Resource
    private OaCourseMapper oaCourseMapper;

    @Override
    public int deleteByPrimaryKey(Integer cId) {
        return oaCourseMapper.deleteByPrimaryKey(cId);
    }

    @Override
    public int insert(OaCourse record) {
        return oaCourseMapper.insert(record);
    }

    @Override
    public int insertSelective(OaCourse record) {
        return oaCourseMapper.insertSelective(record);
    }

    @Override
    public OaCourse selectByPrimaryKey(Integer cId) {
        return oaCourseMapper.selectByPrimaryKey(cId);
    }

    @Override
    public int updateByPrimaryKeySelective(OaCourse record) {
        return oaCourseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OaCourse record) {
        return oaCourseMapper.updateByPrimaryKey(record);
    }

}
