package com.xie.springcloud.dao;

import com.xie.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 类描述
 *
 * @author : xiexf
 * @version : 1.0
 * @date : 2020/5/28 12:50
 */

@Mapper
public interface PaymentDao {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Payment queryById(Long id);
}
