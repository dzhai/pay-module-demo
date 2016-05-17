package com.github.dzhai.pay.dto;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 结果code
	 */
	private Integer code=200;
	/**
	 * 结果原因
	 */
	private String msg;	
	/**
	 * 其他额外数据
	 */
	private Map<String, String> extraData;
}
