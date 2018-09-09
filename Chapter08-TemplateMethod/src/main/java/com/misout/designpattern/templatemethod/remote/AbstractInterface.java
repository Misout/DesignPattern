package com.misout.designpattern.templatemethod.remote;

import com.misout.designpattern.templatemethod.constants.ReturnCode;
import com.misout.designpattern.templatemethod.request.BaseRequest;
import com.misout.designpattern.templatemethod.result.Result;

/**
 * @author Misout
 * @date 2018-09-09 18:10:21
 */
public abstract class AbstractInterface {

    /** 执行日志记录 */
    public void recordLog(BaseRequest request) {
        System.out.println("收到业务ID[" + request.getBusinessId() + "]的请求");
    }

    /** 校验入参合法性 */
    public abstract Result checkParam(BaseRequest request);

    /** 执行业务逻辑方法 */
    public abstract Result execute(BaseRequest request);

    /** 接口请求模板方法，只用把这个方法对外部调用方暴露即可 */
    public final Result templateMethod(BaseRequest request) {
        // 算法步骤1：记录日志
        recordLog(request);

        // 算法步骤2：校验入参合法性
        Result result = checkParam(request);
        if(result.getCode().equals(ReturnCode.INVALID_PARAM)) {
            return result;
        }

        // 算法步骤3：执行业务方法
        result = execute(request);

        // 返回数据
        return result;
    }
}
