package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("com.app")
public class Demo1 {
	private int id;
	private String Code;
	private String[] Orders;
	private List<Integer> list;
	private Map<String,String> map;
	private Process p;
	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String[] getOrders() {
		return Orders;
	}
	public void setOrders(String[] orders) {
		Orders = orders;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Process getP() {
		return p;
	}
	public void setP(Process p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Demo1 [id=" + id + ", Code=" + Code + ", Orders=" + Arrays.toString(Orders) + ", list=" + list
				+ ", map=" + map + ", p=" + p + "]";
	}
	
	

}
