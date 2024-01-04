package com.time.trip.openapi.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DemoVO {

    @ApiModelProperty("demo id")
    private String demoId;

    @ApiModelProperty("demo名称")
    private String demoName;

}
