package com.spider.amazon.mapper;

import com.spider.amazon.model.VcPromotionInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VcPromotionInfoDOMapper {

    int insert(VcPromotionInfoDO record);

    boolean existByPromotionId(Long promotionId);

    int insertSelective(VcPromotionInfoDO record);

    int insertBatch(List<VcPromotionInfoDO> recordList);

}