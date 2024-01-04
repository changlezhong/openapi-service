package com.time.trip.openapi.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DemoForm {

    @Schema(description = "demo id")
    private String demoId;

    @Schema(description = "demo 名称")
    private String demoName;

}
