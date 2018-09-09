package com.misout.designpattern.templatemethod.request;

import java.io.Serializable;

/**
 * @author Misout
 * @date 2018-09-09 19:03:54
 */
public class BaseRequest implements Serializable {

    private static final long serialVersionUID = 4864744547462154030L;

    /** 业务请求ID，全局唯一 */
    private long businessId;

    public BaseRequest() {

    }

    public BaseRequest(long businessId) {
        this.businessId = businessId;
    }

    public long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(long businessId) {
        this.businessId = businessId;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "businessId=" + businessId +
                '}';
    }
}
