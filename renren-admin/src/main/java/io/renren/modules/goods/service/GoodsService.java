package io.renren.modules.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.goods.entity.GoodsEntity;

import java.util.Map;

/**
 * 商品管理
 *
 * @author javaerHuang
 * @email tobetopjavaer@sina.com
 * @date 2019-12-05 13:47:03
 */
public interface GoodsService extends IService<GoodsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

