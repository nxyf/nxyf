package com.nxyf.utils;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDomain {
    /**
     * 当前记录起始索引
     */
    @TableField(exist = false)
    private Long currentPage = 1L;

    /**
     * 每页显示记录数
     */
    @TableField(exist = false)
    private Long pageSize = 10L;

    /**
     * 排序列
     */
    @TableField(exist = false)
    private String orderByColumn;
    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    @TableField(exist = false)
    private String isAsc;

}
