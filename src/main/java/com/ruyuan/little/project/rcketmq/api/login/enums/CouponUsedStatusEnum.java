package com.ruyuan.little.project.rcketmq.api.login.enums;

/**
 * 优惠券使用状态枚举
 */
public enum CouponUsedStatusEnum {

    /**
     * 未使用
     */
    NOT_USED(0, "未使用"),

    /**
     * 已使用
     */
    ALREADY_USED(1, "已使用");

    private Integer status;

    private String desc;

    CouponUsedStatusEnum(Integer status, String desc) {
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
