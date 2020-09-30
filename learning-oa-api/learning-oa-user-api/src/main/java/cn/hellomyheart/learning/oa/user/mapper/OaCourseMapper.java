package cn.hellomyheart.learning.oa.user.mapper;

import cn.hellomyheart.learning.oa.domain.OaCourse;

public interface OaCourseMapper {
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
    int insert(OaCourse record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OaCourse record);

    /**
     * select by primary key
     * @param cId primary key
     * @return object by primary key
     */
    OaCourse selectByPrimaryKey(Integer cId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OaCourse record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OaCourse record);
}