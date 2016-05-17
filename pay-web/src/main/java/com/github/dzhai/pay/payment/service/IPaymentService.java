package com.github.dzhai.pay.payment.service;

import com.github.dzhai.pay.dto.PaymentResultData;

public interface IPaymentService {

	PaymentResultData createProcess();

	void payProcess();

	void refundProcess();

	void notifyProcess();

	void returnProcess();
}
