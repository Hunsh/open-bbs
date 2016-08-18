package com.openbbs.exception;

/**
 * 
 * @author gaoyj
 * @date 2016年8月12日
 *
 */
public enum ErrorCode {
	SUCCESS(1,"success",null)
	,FAIL(0, "fail", null);
	;
	
	private long code;
	
	private String desciption;
	
	private Throwable cause;
	
	private ErrorCode(long code, String description, Throwable cause){
		this.code = code;
		this.desciption = description;
		this.cause = cause;
	}
	
	public long getCode() {
		return code;
	}

	public String getDesciption() {
		return desciption;
	}

	public Throwable getCause() {
		return cause;
	}
	
}
