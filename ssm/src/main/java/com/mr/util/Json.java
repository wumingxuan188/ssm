package com.mr.util;

import java.io.Serializable;

public class Json implements Serializable{
	private static final long serialVersionUID = -4274911820768862062L;
	//返回的信息
	private String msg = "";
	//请求是否成功
	private Boolean success = true;
	//返回的对象
	private Object object;
	//返回状态
	private Integer state = 0;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Json [msg=" + msg + ", success=" + success + ", object="
				+ object + ", state=" + state + "]";
	}
}
