
package com.nxyf.modules.system.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nxyf.modules.system.entity.SysUserEntity;
import com.nxyf.modules.system.service.SysUserService;
import com.nxyf.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 系统用户
 */
@RestController
@RequestMapping("/sys/user")
@Api(tags = {"用户管理模块"})//可以配置多个
public class SysUserController {


    @Autowired
    private SysUserService userService;

    @ApiOperation(value = "查询用户信息",tags = "用户详细信息")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK", response = R.class) })
    @GetMapping("/info/{id}")
    public R queryInfo(@ApiParam(value = "用户ID",required = true) @PathVariable("id") Long id) {
        SysUserEntity userEntity = userService.getById(id);
        return R.ok().put("data",userEntity);
    }

    @ApiOperation(value = "分页查询用户",notes = "用户列表")
    @PostMapping("/list")
    public R queryList(@ApiParam(value = "用户查询条件") @RequestBody @Validated SysUserEntity userEntity){
        IPage page =userService.queryList(userEntity);
        return R.ok().put("data",page);
    }
}
