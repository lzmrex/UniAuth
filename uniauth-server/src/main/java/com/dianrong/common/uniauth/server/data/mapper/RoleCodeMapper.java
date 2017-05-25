package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.RoleCode;
import com.dianrong.common.uniauth.server.data.entity.RoleCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleCodeMapper {
  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int countByExample(RoleCodeExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int deleteByExample(RoleCodeExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int insert(RoleCode record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int insertSelective(RoleCode record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  List<RoleCode> selectByExample(RoleCodeExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  RoleCode selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int updateByExampleSelective(@Param("record") RoleCode record,
      @Param("example") RoleCodeExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int updateByExample(@Param("record") RoleCode record, @Param("example") RoleCodeExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int updateByPrimaryKeySelective(RoleCode record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * role_code
   *
   * @mbggenerated Tue Jan 26 11:13:56 CST 2016
   */
  int updateByPrimaryKey(RoleCode record);
}
