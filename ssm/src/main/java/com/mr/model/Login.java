package com.mr.model;

import java.util.Date;

public class Login {
    private Integer loginId;

    private String loginName;

    private String loginPsw;

    private Integer loginErrnum;

    private Date loginTime;

    private Date loginColdtime;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPsw() {
        return loginPsw;
    }

    public void setLoginPsw(String loginPsw) {
        this.loginPsw = loginPsw == null ? null : loginPsw.trim();
    }

    public Integer getLoginErrnum() {
        return loginErrnum;
    }

    public void setLoginErrnum(Integer loginErrnum) {
        this.loginErrnum = loginErrnum;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLoginColdtime() {
        return loginColdtime;
    }

    public void setLoginColdtime(Date loginColdtime) {
        this.loginColdtime = loginColdtime;
    }
}