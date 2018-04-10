package com.jay.wechat.controller;

import com.jay.wechat.bo.SubServService;
import com.jay.wechat.po.SubServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sub_serv")
public class SubServController {

    @Autowired
    SubServService subServService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public int add(@RequestBody SubServ subServ){
        return subServService.insert(subServ);
    }
}
