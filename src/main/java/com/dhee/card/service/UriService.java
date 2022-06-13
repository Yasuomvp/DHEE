package com.dhee.card.service;

import com.dhee.card.entity.Uri;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UriService {

    List<Uri> getAllUris();

    List<Uri> selectByTime(String timeBegin,String timeEnd);
}
