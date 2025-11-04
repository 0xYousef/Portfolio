package com.eagle0eye.metrics_api.metrics.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @Builder
public class Comment {
    private String text;
    private String date;
}
