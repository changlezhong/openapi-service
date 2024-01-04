package com.time.trip.openapi.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TestVO {

    @ApiModelProperty("test id")
    private String testId;

    @ApiModelProperty("test名称")
    private String testName;

}
