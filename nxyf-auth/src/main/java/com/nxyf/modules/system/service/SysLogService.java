
package com.nxyf.modules.system.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.nxyf.modules.system.entity.SysLogEntity;
import com.nxyf.utils.PageUtils;

import java.util.Map;


/**
 * 系统日志
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
