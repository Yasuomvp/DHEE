package com.dhee.card.controller;


import com.dhee.card.entity.Pntinf;
import com.dhee.card.service.PntinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/pntinfo")
@Controller
public class PntinfController {

    @Autowired
    private PntinfService pntinfService;

    @GetMapping("selectByTime")
    @ResponseBody
    public List<Pntinf> selectByTime(String timeBegin,String timeEnd){
        System.out.println(timeBegin+" "+timeEnd);
        return pntinfService.selectByTime(timeBegin, timeEnd);
    }

}
