
package com.nxyf.modules.system.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.nxyf.modules.system.entity.SysRoleEntity;
import com.nxyf.utils.PageUtils;

import java.util.Map;


/**
 * 角色
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
