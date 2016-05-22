package com.github.dzhai.pay.payment.service.impl;

import com.github.dzhai.pay.dto.PaymentResultData;
import com.github.dzhai.pay.payment.service.IPaymentService;

public abstract class AbstractPaymentService implements IPaymentService {

	
	public abstract void paycreateAfter(PaymentResultData data);
	
	public PaymentResultData paycreate(){
		PaymentResultData data=new PaymentResultData();
		paycreateAfter(data);
		return null;
		
	}
}
