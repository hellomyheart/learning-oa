package cn.hellomyheart.learning.oa.user.mapper;

import cn.hellomyheart.learning.oa.domain.OaLoginlog;

public interface OaLoginlogMapper {
    /**
     * delete by primary key
     * @param lId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer lId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OaLoginlog record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaLoginlog record);

    /**
     * select by primary key
     * @param lId primary key
     * @return object by primary key
     */
    OaLoginlog selectByPrimaryKey(Integer lId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaLoginlog record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaLoginlog record);
}