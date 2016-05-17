package com.github.dzhai.pay.payment.utils;

import java.util.HashMap;
import java.util.Map;
import com.github.dzhai.pay.common.PayClientType;
import com.github.dzhai.pay.common.PayMethod;
import com.github.dzhai.pay.common.PaymentType;
import com.github.dzhai.pay.payment.service.IPaymentService;
import com.github.dzhai.pay.service.IPayBusinessDubboService;
import com.github.dzhai.pay.utils.ApplicationUtil;

public class PaymentUtils {

	
	private static Map<String, String> paymentServiceMap = new HashMap<>();
	private static Map<String, String> payBusinessServiceMap = new HashMap<>();

	static {

		paymentServiceMap.put(PayMethod.ALIPAY.getId() + "-" + PayClientType.PC.getId(), "alipayPCPaymentService");
		paymentServiceMap.put(PayMethod.PAYPAL.getId() + "-" + PayClientType.PC.getId(), "paypalPCPaymentService");
		paymentServiceMap.put(PayMethod.WECHAT.getId() + "-" + PayClientType.PC.getId(), "wechatPCPaymentService");
		paymentServiceMap.put(PayMethod.UNIONPAY.getId() + "-" + PayClientType.PC.getId(), "unionpayPCPaymentService");
		
		payBusinessServiceMap.put(PaymentType.ORDER.getId()+"", "orderPayBusinessDubboService");
		payBusinessServiceMap.put(PaymentType.RECHARGE.getId()+"", "rechargePayBusinessDubboService");
	}

	public static IPaymentService getPaymentService(Integer paymethod, Integer payClientType) {
		String key = paymethod + "-" + payClientType;
		if (paymentServiceMap.containsKey(key)) {
			String beanName = paymentServiceMap.get(key);
			return (IPaymentService) ApplicationUtil.getBean(beanName);
		}
		throw new RuntimeException("没有此支付方式");
	}
		
	public static IPayBusinessDubboService getIPayBusinessDubboService(Integer paymentType) {
		String key=paymentType+"";
		if (payBusinessServiceMap.containsKey(key)) {
			String beanName = payBusinessServiceMap.get(key);
			return (IPayBusinessDubboService) ApplicationUtil.getBean(beanName);
		}
		throw new RuntimeException("没有此支付dubbo服务方式");
	}
}
