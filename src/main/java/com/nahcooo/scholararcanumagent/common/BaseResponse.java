package com.nahcooo.scholararcanumagent.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: NaHCOOO
 * @space: http://www.nahcooo.cn
 * @github: https://github.com/NaHCOOO
 * @Description:
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ResponseCode responseCode) {
        this(responseCode.getCode(), null, responseCode.getMessage(), responseCode.getDescription());
    }
}
