package com.dhee.card.service;

import com.dhee.card.entity.Pntinf;
import com.dhee.card.entity.Uri;

import java.util.List;

public interface PntinfService {

    List<Pntinf> selectByTime(String timeBegin, String timeEnd);

}
