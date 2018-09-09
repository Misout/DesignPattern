package com.misout.designpattern.templatemethod.request;

/**
 * @author Administrator
 * @date 2018-09-09 19:12:37
 */
public class UserRequest extends BaseRequest {

    private static final long serialVersionUID = -5255944093621874878L;

    private String userName;

    public UserRequest() {
        super();
    }

    public UserRequest(long businessId) {
        super(businessId);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserRequest{userName='" + userName + '\'' + '}';
    }
}
