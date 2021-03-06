package com.lkl.dcloud.user.dao.gen;

import com.lkl.dcloud.user.dao.gen.bean.SpUserCount;
import com.lkl.dcloud.user.dao.gen.bean.SpUserCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SpUserCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @SelectProvider(type=SpUserCountSqlProvider.class, method="countByExample")
    int countByExample(SpUserCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=SpUserCountSqlProvider.class, method="deleteByExample")
    int deleteByExample(SpUserCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `sp_user_count`",
        "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `sp_user_count` (user_id, order_count, ",
        "create_time, update_time)",
        "values (#{userId,jdbcType=VARCHAR}, #{orderCount,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(SpUserCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @InsertProvider(type=SpUserCountSqlProvider.class, method="insertSelective")
    int insertSelective(SpUserCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @SelectProvider(type=SpUserCountSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SpUserCount> selectByExample(SpUserCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "user_id, order_count, create_time, update_time",
        "from `sp_user_count`",
        "where user_id = #{userId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SpUserCount selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SpUserCountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SpUserCount record, @Param("example") SpUserCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_user_count`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SpUserCountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SpUserCount record);
}