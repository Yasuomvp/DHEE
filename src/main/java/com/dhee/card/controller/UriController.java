package com.dhee.card.controller;


import com.dhee.card.entity.Uri;
import com.dhee.card.service.UriService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/uri")
public class UriController {

    @Autowired
    private UriService uriService;


    @ResponseBody
    @RequestMapping("/all")
    public List<Uri> getAllUris(){
        List<Uri> allUris = uriService.getAllUris();
        return allUris;
    }

    @ResponseBody
    @RequestMapping("/selectByTime")
    public List<Uri> selectByTime(String timeBegin,String timeEnd){
        return uriService.selectByTime(timeBegin,timeEnd);
    }

}
