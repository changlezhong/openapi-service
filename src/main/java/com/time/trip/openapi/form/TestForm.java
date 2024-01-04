package com.time.trip.openapi.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TestForm {

    @ApiModelProperty("test id")
    private String testId;

    @ApiModelProperty("test名称")
    private String testName;

}
