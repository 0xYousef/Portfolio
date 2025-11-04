package com.eagle0eye.metrics_api.assets.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ReadAsset {
    private String title;
    private String link;
}
