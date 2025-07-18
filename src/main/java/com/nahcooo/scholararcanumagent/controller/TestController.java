package com.nahcooo.scholararcanumagent.controller;

import com.nahcooo.scholararcanumagent.common.BaseResponse;
import com.nahcooo.scholararcanumagent.common.ResponseCode;
import com.nahcooo.scholararcanumagent.exception.BusinessException;
import com.nahcooo.scholararcanumagent.utils.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: NaHCOOO
 * @space: http://www.nahcooo.cn
 * @github: https://github.com/NaHCOOO
 * @Description:
 */
@RestController
@RequestMapping("/check")
public class TestController {

    @GetMapping("/success")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }

    @GetMapping("/error")
    public BaseResponse<String> errorCheck() {
        throw new BusinessException(ResponseCode.SYSTEM_ERROR, "系统错误测试");
    }
}
