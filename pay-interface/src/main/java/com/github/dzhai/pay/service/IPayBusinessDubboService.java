package com.github.dzhai.pay.service;

import com.github.dzhai.pay.dto.BusinessResultData;
import com.github.dzhai.pay.dto.PaySuccessResultData;

/**
 * 业务实现接口
 * @author dzhai
 *
 */
public interface IPayBusinessDubboService {

	/**
	 * 支付确认
	 * @param outTradeNo
	 * @param money
	 */
	BusinessResultData payApprove(String outTradeNo, String money);
	
	/**
	 * 接收支付信息回调
	 * @param data
	 * @return
	 */
	BusinessResultData receive(PaySuccessResultData data);
	
	/**
	 * 退款确认
	 * @param outTradeNo
	 * @param money
	 */
	BusinessResultData refundApprove(String outTradeNo, String money);
}
