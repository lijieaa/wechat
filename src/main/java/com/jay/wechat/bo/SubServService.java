package com.jay.wechat.bo;

import com.jay.wechat.po.SubServ;

import java.util.List;

public interface SubServService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    int insert(SubServ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    SubServ selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    List<SubServ> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SubServ record);

    List<SubServ> findAllSubServService(int pageNum, int pageSize);
}