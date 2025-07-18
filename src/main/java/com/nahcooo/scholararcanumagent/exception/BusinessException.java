package com.nahcooo.scholararcanumagent.exception;

import com.nahcooo.scholararcanumagent.common.ResponseCode;

/**
 * @Author: NaHCOOO
 * @space: http://www.nahcooo.cn
 * @github: https://github.com/NaHCOOO
 * @Description:
 */
public class BusinessException extends RuntimeException {

    private final int code;

    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ResponseCode responseCode) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
        this.description = responseCode.getDescription();
    }

    public BusinessException(ResponseCode responseCode, String description) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
