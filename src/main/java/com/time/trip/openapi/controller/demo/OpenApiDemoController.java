package com.time.trip.openapi.controller.demo;

import com.time.trip.openapi.form.TestForm;
import com.time.trip.openapi.response.SingleResponse;
import com.time.trip.openapi.vo.TestVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "demo")
@RestController
@RequestMapping("/openapi")
public class OpenApiDemoController {

    @Operation(summary = "测试GET请求", operationId = "demoGetRequest")
    @Parameters({
            @Parameter(name = "id", required = true, description = "id"),
            @Parameter(name = "name", required = true, description = "demo 名称")
    })
    @GetMapping("/demo")
    public SingleResponse<List<TestVO>> testGetRequest(@RequestParam String id, @RequestParam String name) {
        List<TestVO> list = new ArrayList<>();
        // 业务处理
        // ...
        return SingleResponse.of(list);
    }

    @Operation(summary = "测试POST请求", operationId = "demoPostRequest")
    @PostMapping("/demo")
    public SingleResponse<Boolean> testPostRequest(@RequestBody TestForm form) {
        // 业务处理
        // ...
        return SingleResponse.of(true);
    }

}
