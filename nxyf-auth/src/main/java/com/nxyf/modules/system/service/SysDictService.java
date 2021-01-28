
package com.nxyf.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nxyf.modules.system.entity.SysDictEntity;
import com.nxyf.utils.PageUtils;

import java.util.Map;

/**
 * 数据字典
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

