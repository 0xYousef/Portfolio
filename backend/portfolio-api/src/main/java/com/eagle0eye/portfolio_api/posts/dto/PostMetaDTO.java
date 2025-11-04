package com.eagle0eye.portfolio_api.posts.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder(toBuilder = true)
@Getter
@Setter
public class PostMetaDTO {
    private String id;
    private String title;
    @Builder.Default
    private List<String> tags = new ArrayList<>();
    private String field;
    private String type;
    private String modifiedAt;
    private String createdAt;
    private String link;
}
