package com.mr.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
    private Integer stuId;

    private String stuName;

    private Integer stuSex;

    private String stuHobby;

    private String stuImg;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date stuBir;

    private Integer clsId;

    private Integer stuHome;
    
    private Cls cls;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuHobby() {
        return stuHobby;
    }

    public void setStuHobby(String stuHobby) {
        this.stuHobby = stuHobby == null ? null : stuHobby.trim();
    }

    public String getStuImg() {
        return stuImg;
    }

    public void setStuImg(String stuImg) {
        this.stuImg = stuImg == null ? null : stuImg.trim();
    }

    public Date getStuBir() {
        return stuBir;
    }
    public String getStuBirStr() {
    	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
    	if(stuBir!=null) {
    		return sim.format(stuBir);
    	}else {
    		return "";
    	}
    }

    public void setStuBir(Date stuBir) {
        this.stuBir = stuBir;
    }

    public Integer getClsId() {
        return clsId;
    }

    public void setClsId(Integer clsId) {
        this.clsId = clsId;
    }

    public Integer getStuHome() {
        return stuHome;
    }

    public void setStuHome(Integer stuHome) {
        this.stuHome = stuHome;
    }

	public Cls getCls() {
		return cls;
	}

	public void setCls(Cls cls) {
		this.cls = cls;
	}
}