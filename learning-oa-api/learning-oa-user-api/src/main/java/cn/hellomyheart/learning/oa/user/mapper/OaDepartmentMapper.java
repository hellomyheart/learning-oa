package cn.hellomyheart.learning.oa.user.mapper;

import cn.hellomyheart.learning.oa.domain.OaDepartment;

public interface OaDepartmentMapper {
    /**
     * delete by primary key
     * @param dId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer dId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OaDepartment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaDepartment record);

    /**
     * select by primary key
     * @param dId primary key
     * @return object by primary key
     */
    OaDepartment selectByPrimaryKey(Integer dId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaDepartment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaDepartment record);
}