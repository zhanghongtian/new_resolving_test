package com.chengjuiot.exception;


import com.chengjuiot.result.CodeMsg;

public class GlobalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CodeMsg cm;

	public GlobalException(CodeMsg cm) {
		super(cm.getMsg());
		this.cm = cm;
	}

	public CodeMsg getCm() {
		return cm;
	}

}
