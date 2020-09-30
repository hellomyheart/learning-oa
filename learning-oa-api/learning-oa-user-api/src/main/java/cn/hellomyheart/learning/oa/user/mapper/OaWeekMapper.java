package cn.hellomyheart.learning.oa.user.mapper;

import cn.hellomyheart.learning.oa.domain.OaWeek;

public interface OaWeekMapper {
    /**
     * delete by primary key
     * @param wId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer wId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OaWeek record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaWeek record);

    /**
     * select by primary key
     * @param wId primary key
     * @return object by primary key
     */
    OaWeek selectByPrimaryKey(Integer wId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaWeek record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaWeek record);
}