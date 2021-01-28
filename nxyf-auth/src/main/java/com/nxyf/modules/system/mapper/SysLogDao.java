
package com.nxyf.modules.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nxyf.modules.system.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
