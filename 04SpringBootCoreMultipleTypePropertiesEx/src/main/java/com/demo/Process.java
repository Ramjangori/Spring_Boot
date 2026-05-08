package com.demo;

import org.springframework.stereotype.Component;


public class Process {
	private int  pId;
	private String pCode;
	public Process() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	@Override
	public String toString() {
		return "Process [pId=" + pId + ", pCode=" + pCode + "]";
	}
	

}
