package com.playjoy.mapper;

import com.playjoy.entity.DataSign;
import com.playjoy.entity.DataSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    long countByExample(DataSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int deleteByExample(DataSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String signid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int insert(DataSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int insertSelective(DataSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    List<DataSign> selectByExample(DataSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    DataSign selectByPrimaryKey(String signid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DataSign record, @Param("example") DataSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DataSign record, @Param("example") DataSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DataSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DataSign record);
}