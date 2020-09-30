package cn.hellomyheart.learning.oa.admin.mapper;

import cn.hellomyheart.learning.oa.domain.OaClass;

public interface OaClassMapper {
    /**
     * delete by primary key
     * @param cId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OaClass record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaClass record);

    /**
     * select by primary key
     * @param cId primary key
     * @return object by primary key
     */
    OaClass selectByPrimaryKey(Integer cId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaClass record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaClass record);
}