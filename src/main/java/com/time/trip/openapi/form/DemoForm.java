package com.time.trip.openapi.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DemoForm {

    @ApiModelProperty("demo id")
    private String demoId;

    @ApiModelProperty("demo名称")
    private String demoName;

}
