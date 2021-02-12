package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Naichuan Zhang
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Object> create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("create result = " + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入数据成功", null);
        }
        return new CommonResult<>(444, "插入数据失败");
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("get payment = " + payment);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功", payment);
        }
        return new CommonResult<>(444, "没有对应记录, 查询id为" + id);
    }
}
