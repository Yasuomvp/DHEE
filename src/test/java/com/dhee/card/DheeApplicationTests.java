package com.dhee.card;

import com.dhee.card.mapper.PntinfMapper;
import com.dhee.card.mapper.UriMapper;
import com.dhee.card.entity.Uri;
import com.dhee.card.service.UriService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.dhee.card.Mapper")
class DheeApplicationTests {

    @Autowired
    private UriService uriService;
    @Autowired
    private UriMapper uriMapper;
    @Autowired
    private PntinfMapper pntinfMapper;
    @Test
    void contextLoads() {
        List<Uri> allUris = uriService.getAllUris();
        System.out.println("allUris = " + allUris);

    }

    @Test
    void test1(){
        System.out.println(uriService.selectByTime("2000-01-02","2022-09-12"));
    }

    @Test
    void test2(){
        System.out.println(pntinfMapper.selectByTime("2000-01-02","2022-09-12"));
    }

}
