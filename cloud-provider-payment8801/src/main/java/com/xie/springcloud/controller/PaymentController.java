package com.xie.springcloud.controller;

import com.xie.springcloud.entities.CommonResult;
import com.xie.springcloud.entities.Payment;
import com.xie.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 类描述
 *
 * @author : xiexf
 * @version : 1.0
 * @date : 2020/5/28 12:49
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.queryById(id);

        return new CommonResult<Payment>(200, "select success 8001!", payment);
    }
}
