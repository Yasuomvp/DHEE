package com.dhee.card.service.impl;

import com.dhee.card.entity.Pntinf;
import com.dhee.card.mapper.PntinfMapper;
import com.dhee.card.service.PntinfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PntinfoServiceImpl implements PntinfService {


    @Autowired
    private PntinfMapper pntinfMapper;


    @Override
    public List<Pntinf> selectByTime(String timeBegin, String timeEnd) {
        return pntinfMapper.selectByTime(timeBegin,timeEnd);
    }
}
