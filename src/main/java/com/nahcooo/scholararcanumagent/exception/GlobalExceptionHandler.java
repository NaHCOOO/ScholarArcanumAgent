package com.nahcooo.scholararcanumagent.exception;

import com.nahcooo.scholararcanumagent.common.BaseResponse;
import com.nahcooo.scholararcanumagent.common.ResponseCode;
import com.nahcooo.scholararcanumagent.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: NaHCOOO
 * @space: http://www.nahcooo.cn
 * @github: https://github.com/NaHCOOO
 * @Description:
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException e) {
        log.error("runtimeException", e);
        return ResultUtils.error(ResponseCode.SYSTEM_ERROR, e.getMessage(), "");
    }
}
