package com.time.trip.openapi.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DemoVO {

    @Schema(description = "demo id")
    private String demoId;

    @Schema(description = "demo 名称")
    private String demoName;

}
