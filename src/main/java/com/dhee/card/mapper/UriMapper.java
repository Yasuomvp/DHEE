package com.dhee.card.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhee.card.entity.Uri;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UriMapper extends BaseMapper<Uri> {

    @Select("select * from URI")
    List<Uri> getAllUris();

    @Select("select * from URI where TRITIM >= TO_TIMESTAMP(#{timeBegin}, 'YYYY-MM-DD HH24:MI:SS.FF6') and TRITIM <= TO_TIMESTAMP(#{timeEnd}, 'YYYY-MM-DD HH24:MI:SS.FF6')")
    List<Uri> selectByTime(@Param("timeBegin") String timeBegin,@Param("timeEnd") String timeEnd);

    //YYYY-MM-DD HH24:MI:SS.FF6

}
