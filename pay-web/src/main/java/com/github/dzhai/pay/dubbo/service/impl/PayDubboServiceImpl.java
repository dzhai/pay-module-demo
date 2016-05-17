package com.github.dzhai.pay.dubbo.service.impl;

import com.github.dzhai.pay.common.PayMethod;
import com.github.dzhai.pay.dto.PaymentData;
import com.github.dzhai.pay.dto.PaymentResultData;
import com.github.dzhai.pay.dto.RefundData;
import com.github.dzhai.pay.dto.RefundResultData;
import com.github.dzhai.pay.payment.service.IPaymentService;
import com.github.dzhai.pay.payment.utils.PaymentUtils;
import com.github.dzhai.pay.service.IPayDubboService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayDubboServiceImpl implements IPayDubboService {
	
	@Override
	public PaymentResultData pay(PaymentData data) {
		log.info("----");
		Integer paymethod=data.getPayMehtod();		
		Integer payClientType=data.getPayClientType();
		if(paymethod==null){ //如何paymethod是NULL,直接设置paymethod是unionpay 银联
			paymethod= PayMethod.UNIONPAY.getId();
		}
		IPaymentService paymentService=PaymentUtils.getPaymentService(paymethod, payClientType);
		PaymentResultData resultData=paymentService.createProcess();
		return resultData;
	}

	@Override
	public RefundResultData refund(RefundData data) {
		// TODO Auto-generated method stub
		return null;
	}

}
