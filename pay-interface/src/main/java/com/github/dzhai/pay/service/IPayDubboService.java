package com.github.dzhai.pay.service;

import com.github.dzhai.pay.dto.PaymentData;
import com.github.dzhai.pay.dto.PaymentResultData;
import com.github.dzhai.pay.dto.RefundData;
import com.github.dzhai.pay.dto.RefundResultData;

public interface IPayDubboService {

	/**
	 * 支付内部请求接口
	 * @param data
	 * @return
	 */
	PaymentResultData pay(PaymentData data);
	
	/**
	 * 退款内部请求
	 * @param data
	 * @return
	 */
	RefundResultData refund(RefundData data);
}
