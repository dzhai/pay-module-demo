package com.github.dzhai.pay.common;

/**
 * 支付类型
 * 
 * @author dzhai
 *
 */
public enum PaymentType {
	/**
	 * 订单支付 1
	 */
	ORDER(1, "订单支付"),
	/**
	 * 充值  2
	 */
	RECHARGE(2, "充值"),
	/**
	 * 赠送 3
	 */
	DONATE(3, "赠送");
	

	private Integer id;
	private String name;

	private PaymentType(Integer id, String name) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static String getName(Integer id) {
		if (id == null) {
			return null;
		} else {
			for (PaymentType p : PaymentType.values()) {
				if (p.getId().equals(id)) {
					return p.getName();
				}
			}
		}
		return null;
	}

}
