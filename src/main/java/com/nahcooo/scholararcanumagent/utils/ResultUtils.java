package com.nahcooo.scholararcanumagent.utils;

import com.nahcooo.scholararcanumagent.common.BaseResponse;
import com.nahcooo.scholararcanumagent.common.ResponseCode;

/**
 * @Author: NaHCOOO
 * @space: http://www.nahcooo.cn
 * @github: https://github.com/NaHCOOO
 * @Description:
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param responseCode
     * @return
     */
    public static BaseResponse error(ResponseCode responseCode) {
        return new BaseResponse<>(responseCode);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @param description
     * @return
     */
    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse(code, null, message, description);
    }

    /**
     * 失败
     *
     * @param responseCode
     * @return
     */
    public static BaseResponse error(ResponseCode responseCode, String message, String description) {
        return new BaseResponse(responseCode.getCode(), null, message, description);
    }

    /**
     * 失败
     *
     * @param responseCode
     * @return
     */
    public static BaseResponse error(ResponseCode responseCode, String description) {
        return new BaseResponse(responseCode.getCode(), responseCode.getMessage(), description);
    }
}
