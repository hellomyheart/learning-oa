package cn.hellomyheart.learning.oa.admin.mapper;

import cn.hellomyheart.learning.oa.domain.OaEmployee;

public interface OaEmployeeMapper {
    /**
     * delete by primary key
     * @param eId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer eId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OaEmployee record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaEmployee record);

    /**
     * select by primary key
     * @param eId primary key
     * @return object by primary key
     */
    OaEmployee selectByPrimaryKey(Integer eId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaEmployee record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaEmployee record);
}