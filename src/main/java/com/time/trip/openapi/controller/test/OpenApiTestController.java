package com.time.trip.openapi.controller.test;

import com.time.trip.openapi.form.TestForm;
import com.time.trip.openapi.response.SingleResponse;
import com.time.trip.openapi.vo.TestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "test api", tags = {"test"})
@RestController
@RequestMapping("/openapi")
public class OpenApiTestController {

    @ApiOperation(value = "测试GET请求", nickname = "testGetRequest")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "test 名称", required = true, dataType = "String", paramType = "query"),
    })
    @GetMapping("/test")
    public SingleResponse<List<TestVO>> testGetRequest(@RequestParam String id, @RequestParam String name) {
        List<TestVO> list = new ArrayList<>();
        // 业务处理
        // ...
        return SingleResponse.of(list);
    }

    @ApiOperation(value = "测试POST请求", nickname = "testPostRequest")
    @PostMapping("/test")
    public SingleResponse<Boolean> testPostRequest(@RequestBody TestForm form) {
        // 业务处理
        // ...
        return SingleResponse.of(true);
    }

}
