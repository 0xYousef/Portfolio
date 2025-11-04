package com.eagle0eye.metrics_api.metrics.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class CommentResponse {
    private String author;
    private String comment;
    private String date;
}
