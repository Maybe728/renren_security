package io.renren.modules.goods.dao;

import io.renren.modules.goods.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author javaerHuang
 * @email tobetopjavaer@sina.com
 * @date 2019-12-05 13:47:03
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
