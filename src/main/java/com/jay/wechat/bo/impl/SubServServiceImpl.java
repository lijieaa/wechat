package com.jay.wechat.bo.impl;

import com.github.pagehelper.PageHelper;
import com.jay.wechat.bo.SubServService;
import com.jay.wechat.dao.SubServMapper;
import com.jay.wechat.po.SubServ;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/4/8.
 */
public class SubServServiceImpl implements SubServService {
    @Autowired
    SubServMapper subServMapper;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(SubServ record) {
        return subServMapper.insert(record);
    }

    public SubServ selectByPrimaryKey(Integer id) {
        return null;
    }

    public List<SubServ> selectAll() {
        return null;
    }

    public int updateByPrimaryKey(SubServ record) {
        return 0;
    }

    public List<SubServ> findAllSubServService(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return subServMapper.findByPage();
    }
}
