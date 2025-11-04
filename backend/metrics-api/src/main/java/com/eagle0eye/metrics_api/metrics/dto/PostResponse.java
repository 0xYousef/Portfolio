package com.eagle0eye.metrics_api.metrics.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder @Getter @Setter
public class PostResponse {
    private String author;
    @Builder.Default
    private List<LikeResponse> likes = new ArrayList<>();
    @Builder.Default
    private List<CommentResponse> comments = new ArrayList<>();
    private int shares;
}
