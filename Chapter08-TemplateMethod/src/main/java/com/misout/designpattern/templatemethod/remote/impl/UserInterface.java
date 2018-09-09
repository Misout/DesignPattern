package com.misout.designpattern.templatemethod.remote.impl;

import com.misout.designpattern.templatemethod.constants.ReturnCode;
import com.misout.designpattern.templatemethod.model.User;
import com.misout.designpattern.templatemethod.remote.AbstractInterface;
import com.misout.designpattern.templatemethod.request.BaseRequest;
import com.misout.designpattern.templatemethod.request.UserRequest;
import com.misout.designpattern.templatemethod.result.Result;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Administrator
 * @date 2018-09-09 19:10:13
 */
public class UserInterface extends AbstractInterface {

    @Override
    public Result checkParam(BaseRequest request) {
        UserRequest userRequest = (UserRequest)request;
        if(StringUtils.isEmpty(userRequest.getUserName())) {
            return new Result(ReturnCode.INVALID_PARAM, "userName is not allowed empty", null);
        }
        return new Result(ReturnCode.SUCCESS, "success", null);
    }

    @Override
    public Result execute(BaseRequest request) {
        UserRequest userRequest = (UserRequest)request;
        // TODO : 根据userName查询用户信息逻辑。此处模拟成功查询
        User user = new User(1L, "张三", 20, "男");

        return new Result<User>(ReturnCode.SUCCESS, "success", user);
    }
}
