package com.dhee.card.service.impl;

import com.dhee.card.mapper.UriMapper;
import com.dhee.card.entity.Uri;
import com.dhee.card.service.UriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UriServiceImpl implements UriService {

    @Autowired
    private UriMapper uriMapper;

    @Override
    public List<Uri> getAllUris() {
        return uriMapper.getAllUris();
    }

    @Override
    public List<Uri> selectByTime(String timeBegin,String timeEnd) {
        return uriMapper.selectByTime(timeBegin,timeEnd);
    }
}
