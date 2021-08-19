package com.ruyuan.little.project.rcketmq.api.login.enums;

/**
 * 第一次登陆状态枚举
 **/
public enum FirstLoginStatusEnum {
    YES(1, "未登录过"),

    NO(2, "已登录过");

    private Integer status;

    private String desc;

    FirstLoginStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
