package cn.hellomyheart.learning.oa.admin.mapper;

import cn.hellomyheart.learning.oa.domain.OaUser;

public interface OaUserMapper {
    /**
     * delete by primary key
     * @param uId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer uId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OaUser record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaUser record);

    /**
     * select by primary key
     * @param uId primary key
     * @return object by primary key
     */
    OaUser selectByPrimaryKey(Integer uId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaUser record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaUser record);
}