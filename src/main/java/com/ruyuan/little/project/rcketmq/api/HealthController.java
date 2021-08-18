package com.ruyuan.little.project.rcketmq.api;

import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(value = "/")
    public CommonResponse health() {
        return CommonResponse.success();
    }
}
