package com.time.trip.openapi.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestVO {

    @Schema(description = "test id")
    private String testId;

    @Schema(description = "test 名称")
    private String testName;

}
