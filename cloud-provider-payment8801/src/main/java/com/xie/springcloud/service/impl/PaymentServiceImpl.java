package com.xie.springcloud.service.impl;

import com.xie.springcloud.dao.PaymentDao;
import com.xie.springcloud.entities.Payment;
import com.xie.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类描述
 *
 * @author : xiexf
 * @version : 1.0
 * @date : 2020/5/28 12:54
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }
}
